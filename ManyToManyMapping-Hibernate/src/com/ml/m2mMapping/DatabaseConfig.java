package com.ml.m2mMapping;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class DatabaseConfig {
	static SessionFactory sf=null;
	static {
		try {
			Configuration config=new Configuration();
			config.addAnnotatedClass(Student.class);
			config.addAnnotatedClass(Course.class);
			config.addAnnotatedClass(Address.class);
			Properties properties=new Properties();
			
			properties.put(Environment.DRIVER, "oracle.jdbc.driver.OracleDriver");
			properties.put(Environment.URL, "jdbc:oracle:thin:@localhost:1521:xe");
			properties.put(Environment.USER, "system");
			properties.put(Environment.PASS, "68921794");
			properties.put(Environment.SHOW_SQL, "true");
			properties.put(Environment.DIALECT, "org.hibernate.dialect.Oracle12cDialect");
			properties.put(Environment.HBM2DDL_AUTO, "update");
			properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
			
			config.setProperties(properties);
			StandardServiceRegistryBuilder ssrbuilder=new StandardServiceRegistryBuilder();
			ServiceRegistry sr=ssrbuilder.applySettings(config.getProperties()).build();
			sf=config.buildSessionFactory(sr);
			
		}catch (Exception e) {
			System.out.println("Exception Occured during Configuration!");
			e.printStackTrace();
		}
	}
	public static SessionFactory getSessionFactory() {
		return sf;
	}
}
