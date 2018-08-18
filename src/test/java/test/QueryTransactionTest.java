package test;

import java.io.DataOutputStream;
import java.util.Base64;

import javax.net.ssl.HttpsURLConnection;

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
	@Ignore
	public void shouldQueryByRequestId() throws Exception {

		setup();
		
		log.debug("Environment: {} => {}", ENVIRONMENT, getEnvInformation());
		log.debug(" Report URL: {} => {}", REPORT_URL);

		// <requestID> is a 22 digit numeric ID corresponding to a transaction in the
		// CyberSource system
		String requestID = "5106476186716067204105";

		try {

			getTxnRecord(requestID);
		} catch (Exception ex) {
			ex.printStackTrace();
			log.error("ERROR: {}", ex.getMessage());
		}
	}

	/*
	 * This method takes a CyberSource request id as input, opens an https
	 * connection to CyberSource and posts the request id. The reply is in the form
	 * of an XML Transaction Detail Report record
	 */

	private static void getTxnRecord(String requestID) throws Exception {

		String rp_username = "itcybs";
		String rp_password = "Password100";

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

		// curl command
		if (log.isDebugEnabled()) {
			StringBuilder curlCmd = new StringBuilder();
			curlCmd.append("curl -kv -POST");
			curlCmd.append(" -x ").append(config.getString("proxy.host")).append(":").append(config.getInt("proxy.port"));
			curlCmd.append(" --url ").append(REPORT_URL);
			curlCmd.append(" --header \"Authorization: ").append(basicAuth).append("\"");
			curlCmd.append(" -d \"merchantID=").append(MERCHANT_ID);
			curlCmd.append(" -d \"type=transaction");
			curlCmd.append(" -d \"subtype=transactionDetail");
			curlCmd.append(" -d \"requestID=").append(requestID);
			log.debug("\n{}\n", curlCmd);
		}
		
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
