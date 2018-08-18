/*
 *------------------------------------------------------------------------------
 * Project Name  : Krungsri e-Payment SDK
 *         Module: Http Connection Utility
 *
 * Created Author: Junlapong L.
 *         Date  : 2015-08-14
 *
 *------------------------------------------------------------------------------
 * Copyright (c) 2015 Bank of Ayudhya Public Company Limited.
 *==============================================================================
 */

package util;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpUtils {

	private static final Logger log = LoggerFactory.getLogger(HttpUtils.class);

	private static Proxy proxy = null;
	private static String PROXY_HOST = "127.0.0.1";
	private static int PROXY_PORT = 3128;

	private static String HTTP_METHOD = "POST";
	private static int CONNECTION_TIMEOUT = 1000 * 60 * 3; // 3 minutes

	static {
		setupSSLProvider();
	}

	public static URLConnection getConnection(String url) throws IOException {

		return getConnection(url, proxy != null);
	}

	public static URLConnection getConnection(String url, boolean useProxy) throws IOException {

		URL targetUrl = new URL(url);
		log.info("CONNECT TO : {}", url);

		if ("https".equalsIgnoreCase(targetUrl.getProtocol())) {
			trustSSLCertificates();
		}
		else {
			throw new IllegalArgumentException("Only support https protocol.");
		}

		HttpsURLConnection httpsConn = null;

		if (useProxy) {
			if (proxy == null) {
				throw new IllegalArgumentException("Invalid proxy setup");
			}

			log.info(" via PROXY : {}", proxy);
			httpsConn = (HttpsURLConnection) targetUrl.openConnection(proxy);
		}
		else {
			httpsConn = (HttpsURLConnection) targetUrl.openConnection();
		}

		httpsConn.setRequestMethod(HTTP_METHOD);
		httpsConn.setConnectTimeout(CONNECTION_TIMEOUT);
		httpsConn.setReadTimeout(CONNECTION_TIMEOUT);

		httpsConn.setUseCaches(false);
		httpsConn.setDoInput(true);
		httpsConn.setDoOutput(true);

		return httpsConn;
	}

	/**
	 * @param debug
	 *            true | false
	 * @param mode
	 *            debuging mode
	 *            <ul>
	 *            <li>all - turn on all debugging</li>
	 *            <li>ssl - turn on ssl debugging</li>
	 *            </ul>
	 * 
	 * @see <a href="http://docs.oracle.com/javase/6/docs/technotes/guides/security/jsse/ReadDebug.html">Debugging SSL/TLS Connections</a>
	 * 
	 */
	public static void debugSSL(boolean debug, String mode) {

		System.setProperty("javax.net.debug", debug ? mode : "");
	}

	public static void setupProxy(String hostname, int port) {
		setupProxy(hostname, port, null, null);
	}

	public static void setupProxy(String hostname, int port, final String username, final char[] password) {

		PROXY_HOST = hostname;
		PROXY_PORT = port;

		log.info("proxy : {}:{}", PROXY_HOST, PROXY_PORT);

		if (username != null && !username.isEmpty() && password != null & password.length > 0) {

			Authenticator authenticator = new Authenticator() {

				@Override
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
			};

			Authenticator.setDefault(authenticator);
		}

		proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(PROXY_HOST, PROXY_PORT));
	}

	private static void setupSSLProvider() {

		log.debug("JVM: {} - {}", System.getProperty("java.vendor"), System.getProperty("java.version"));

		if (System.getProperty("java.vendor").indexOf("IBM") > -1) {
			log.info("set SSL provider for IBM JVM");
			Security.setProperty("ssl.SocketFactory.provider", "com.ibm.jsse2.SSLSocketFactoryImpl");
			Security.setProperty("ssl.ServerSocketFactory.provider", "com.ibm.jsse2.SSLServerSocketFactoryImpl");
		}
	}

	private static void trustSSLCertificates() {

		// Create a trust manager that does not validate certificate chains
		TrustManager[] trustManager = new TrustManager[] { new X509TrustManager() {

			@Override
			public X509Certificate[] getAcceptedIssuers() {
				return null;
			}

			@Override
			public void checkClientTrusted(X509Certificate[] certs, String authType) {
			}

			@Override
			public void checkServerTrusted(X509Certificate[] certs, String authType) {
			}
		} };

		// Install the all-trusting trust manager
		try {

			SSLContext sc = SSLContext.getInstance(getProtocol());
			sc.init(null, trustManager, new SecureRandom());

			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
			HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {

				@Override
				public boolean verify(String hostname, SSLSession sslSession) {

					String[] trustHosts = { "www.krungsriepayment.com", "int.krungsriepayment.com", "192.168.35.31", "localhost" };

					log.debug("Hostname: {}", hostname);
					if (Arrays.asList(trustHosts).contains(hostname)) {
						return true;
					}

					return false;
				}
			});
		}
		catch (GeneralSecurityException e) {
			e.printStackTrace();
			log.error("ERROR: {}", e.getMessage());
		}
	}

	// check JDK. when IBM JDK 6 SR10 => SSL_TLSv2, when Oracle => TLS, TLSv1.2 :
	private static String getProtocol() {

		String protocol = "TLS";

		String vendor = System.getProperty("java.vendor");
		String version = System.getProperty("java.specification.version");

		log.debug("JVM: {} - {}", vendor, version);
		//log.debug("JVM: {}", System.getProperty("java.fullversion"));

		if (vendor != null && vendor.indexOf("IBM") > -1 && Double.valueOf(version) >= 1.6) {
			protocol = "SSL_TLSv2";
		}
		else if (vendor != null && vendor.indexOf("Oracle") > -1 && Double.valueOf(version) >= 1.7) {
			protocol = "TLSv1.2";
		}

		log.debug("SSL/TLS Protocol: {}", protocol);

		return protocol;
	}
}
