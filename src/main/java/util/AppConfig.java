package util;

import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppConfig {

	private static final Logger logger = LoggerFactory.getLogger(AppConfig.class);

	private final String DEFAULT_CONFIG_PATH = "classpath:config/application.properties";

	private String CONFIG_PATH = null;
	private Properties properties = null;

	public AppConfig() {
		this(null);
	}

	public AppConfig(String configPath) {

		CONFIG_PATH = (configPath != null) ? configPath : DEFAULT_CONFIG_PATH;

		try {
			load();
		}
		catch (Exception ex) {
			logger.error("ERROR: {}", ex.getMessage());
		}
	}

	private void load() throws Exception {

		InputStream ins = null;

		try {

			logger.debug("loading {}", CONFIG_PATH);

			String configPath = CONFIG_PATH.replaceAll("classpath:", "");
			ins = Thread.currentThread().getContextClassLoader().getResourceAsStream(configPath);
			if (ins == null) {
				throw new RuntimeException("Cannot load " + configPath);
			}

			properties = new Properties();
			properties.load(ins);
			logger.debug("configure loaded");

		}
		catch (Exception ex) {
			throw ex;
		}
		finally {
			if (null != ins) {
				ins.close();
			}
		}
	}

	public void reload() throws Exception {
		load();
	}

	private String getProperty(String key) {
		return properties.getProperty(key);
	}

	public String getString(String key) {
		return properties.getProperty(key);
	}

	public int getInt(String key) {
		return Integer.parseInt(getProperty(key));
	}

	public boolean getBool(String key) {
		return "true".equalsIgnoreCase(getProperty(key));
	}

}
