package com.ml.utilities;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class DatabaseUtil {
	private static SessionFactory factory;
	private static final Marker FATAL = MarkerFactory.getMarker("FATAL");
	private static final Logger LOG = LoggerFactory.getLogger(DatabaseUtil.class);

	private DatabaseUtil() {
	}

	static {
		LOG.info("Session factory creation started...");
		Configuration config = new Configuration();
		LOG.info("Configuration instance created");
		try {
			if (factory == null)
				factory = config.configure().buildSessionFactory();
		} catch (Exception e) {
			LOG.error(FATAL,
					"Exception occurred while creating a session factory, Factory may not have been initialized properly.");

			DatabaseUtilities.getDetailedStackTrace(e);
		}
	}

	public static SessionFactory getSessionFactory() {
		LOG.info("Invoking DatabaseUtil.getSessionFactory() method...");
		return factory;
	}
}
