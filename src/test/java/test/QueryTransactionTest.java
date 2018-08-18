package test;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.apache.http.NameValuePair;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import util.AppConfig;
import util.HttpUtils;

public class QueryTransactionTest extends CyberSourceBaseTest {

	private static final Logger log = LoggerFactory.getLogger(QueryTransactionTest.class);

	private static AppConfig config;
	private static String MERCHANT_ID;
	private static String ENVIRONMENT;
	private static String REPORT_URL;

	private void setup() {

		config = new AppConfig("cybs.properties");

		MERCHANT_ID = config.getString("merchant.id");
		ENVIRONMENT = config.getString("env");
		REPORT_URL = config.getString("report." + ENVIRONMENT + ".url");

		String proxyEnable = config.getString("proxy.enable");
		log.debug("proxyEnable: {}", proxyEnable);

		if ("true".equalsIgnoreCase(proxyEnable)) {
			HttpUtils.setupProxy(config.getString("proxy.host"), config.getInt("proxy.port"));
		}

		HttpUtils.debugSSL(false, "ssl:handsahake");
	}
	
	@Test
	public void shouldQueryByRequestId1() throws ClientProtocolException, IOException, AuthenticationException {
		
		setup();
		
		String requestID = "5295543636306097804101";
		
	    HttpPost httpPost = new HttpPost(REPORT_URL);
	    
	    UsernamePasswordCredentials creds = new UsernamePasswordCredentials("itcybs", "Password101");
	    httpPost.addHeader(new BasicScheme().authenticate(creds, httpPost, null));
	    
	    List<NameValuePair> postData = new ArrayList<>();
		postData.add(new BasicNameValuePair("merchantID", MERCHANT_ID));
		postData.add(new BasicNameValuePair("type", "transaction"));
		postData.add(new BasicNameValuePair("subtype", "transactionDetail"));
		postData.add(new BasicNameValuePair("requestID", requestID));
		httpPost.setEntity(new UrlEncodedFormEntity(postData));

		//HttpResponse response = HttpClients.createDefault().execute(httpPost);

	    CloseableHttpClient client = HttpClients.createDefault();
	    CloseableHttpResponse response = client.execute(httpPost);
	    
	    //int code = response.getStatusLine().getStatusCode();
	    log.debug("code: {}", response.getStatusLine());
	    log.debug("\n{}", EntityUtils.toString(response.getEntity()));
	    
	    client.close();
	}

	@Test
	@Ignore
	public void shouldQueryByRequestId2() throws Exception {

		setup();
		
		log.debug("Environment: {} => {}", ENVIRONMENT, getEnvInformation());
		log.debug(" Report URL: {} => {}", REPORT_URL);

		// <requestID> is a 22 digit numeric ID corresponding to a transaction in the
		// CyberSource system
		String requestID = "5295543636306097804101";
		getTxnRecord(requestID);

	}

	/*
	 * This method takes a CyberSource request id as input, opens an https
	 * connection to CyberSource and posts the request id. The reply is in the form
	 * of an XML Transaction Detail Report record
	 */

	private static void getTxnRecord(String requestID) throws Exception {

		String rp_username = "itcybs";
		String rp_password = "Password101";

		// Construct post data
		StringBuffer postData = new StringBuffer();
		postData.append("merchantID=").append(MERCHANT_ID);
		postData.append("&type=transaction");
		postData.append("&subtype=transactionDetail");
		postData.append("&requestID=").append(requestID);

		byte[] postDataByte = postData.toString().getBytes("UTF-8");
		int postDataLength = postDataByte.length;

		// Send post data
		HttpsURLConnection conn = (HttpsURLConnection) HttpUtils.getConnection(REPORT_URL);

		// Encode login info
		String userCredentials = rp_username + ":" + rp_password;
		String basicAuth = "Basic " + Base64.getEncoder().encodeToString(userCredentials.getBytes());
		
		log.debug("> {}", basicAuth);

		conn.setRequestMethod("POST");
		conn.setRequestProperty("Authorization", basicAuth);
		conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		conn.setRequestProperty("Content-Length", "" + postDataLength);
		conn.setUseCaches(false);
		conn.setDoInput(true);
		conn.setDoOutput(true);

		try {
			DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
			wr.write(postDataByte);
		} catch (Exception ex) {
			ex.printStackTrace();
			log.error("ERROR: {}", ex.getMessage());
		}

		int responseCode = conn.getResponseCode();
		log.debug(" HTTP STATUS: {} {}", responseCode, conn.getResponseMessage());

	}
}
