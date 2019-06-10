package test;

import util.AppConfig;

/**
 * CxfTest
 */
public class CxfBaseTest {

	protected static AppConfig config;
	protected static String MERCHANT_ID;
	protected static String ENV;
	protected static String SERVER_URL;

	//protected static final String LIB_VERSION = "1.4/1.5.12"; /* Axis Version/WSS4J Version */

	static {

		//System.setProperty("axis.ClientConfigFile", "cybs.wsdd");

		config = new AppConfig("cybs.properties");

		MERCHANT_ID = config.getString("merchant.id");
		ENV = config.getString("env");
		SERVER_URL = config.getString("env." + ENV + ".url");

		String proxyEnable = config.getString("proxy.enable");

		if ("true".equalsIgnoreCase(proxyEnable)) {
			System.setProperty("http.proxyHost", config.getString("proxy.host"));
			System.setProperty("http.proxyPort", config.getString("proxy.port"));
		}
	}

	protected String getEnvInformation() {
		return System.getProperty("os.name") + "/" + System.getProperty("os.version") + "/"
				+ System.getProperty("java.vendor") + "/" + System.getProperty("java.version");
	}
}