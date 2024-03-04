package com.ml.utilities;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DatabaseUtility {
	private static SessionFactory factory;

	private DatabaseUtility() {
	}

	static {
		System.out.println("Session factory creation started...");
		Configuration config = new Configuration();
		System.out.println("Configuration instance created");
		try {
			if (factory == null)
				factory = config.configure().buildSessionFactory();
		} catch (Exception e) {
			System.out.println("Exception in factory creation");
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		System.out.println("Session Factory Created");
		return factory;
	}
}
