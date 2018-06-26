package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.security.Security;
import java.util.Base64;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import util.XmlUtil;

public class QueryTransactionTest extends CyberSourceBaseTest {

	private static final Logger log = LoggerFactory.getLogger(QueryTransactionTest.class);

	// for test system, use https://ebctest.cybersource.com/ebctest/Query
	// for live system, use https://ebc.cybersource.com/ebc/Query
	private static String server = "https://ebctest.cybersource.com/ebctest/Query";
	private static String username = "itcybs";
	private static String passwd = "Password100";

	@Test
	@Ignore
	public void shouldQuery() throws Exception {

		// <requestID> is a 22 digit numeric ID corresponding to a transaction in the
		// CyberSource system
		String requestID = "5106476186716067204105";
		getTxnRecord(requestID);
	}

	/*
	 * This method takes a CyberSource request id as input, opens an https
	 * connection to CyberSource and posts the request id. The reply is in the form
	 * of an XML Transaction Detail Report record
	 */

	private static void getTxnRecord(String requestID) throws Exception {

		// add SSL provider to the java policy file
		System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");
		Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());

		// Construct post data
		String data = "merchantID=" + MERCHANT_ID;
		data += "&type=transaction";
		data += "&subtype=transactionDetail";
		data += "&requestID=" + requestID;

		// Encode login info
		String credential = username + ":" + passwd;
		String encodeAuth = Base64.getEncoder().encodeToString(credential.getBytes());

		// Send post data
		URL url = new URL(server);
		URLConnection conn = url.openConnection();
		conn.setDoOutput(true);

		// Handle basic authentication
		conn.setRequestProperty("Authorization", "Basic " + encodeAuth);
		OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
		wr.write(data);
		wr.flush();

		// Get the response
		BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		StringBuffer result = new StringBuffer();
		int c;

		while ((c = rd.read()) != -1) {
			result.append((char) c);
		}

		String xmlString = result.toString();

		log.debug(xmlString);
		log.debug(XmlUtil.toJsonString(xmlString));

		wr.close();
		rd.close();
	}
}
