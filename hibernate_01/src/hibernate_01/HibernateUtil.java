package hibernate_01;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static SessionFactory factory=null;
	static {
		Configuration cfg=new Configuration();
		cfg=cfg.configure("hibernate_01/hibernate.cfg.xml");
		factory=cfg.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory() {
		return factory;
	}

	public static void main(String[] args) {
		

	}

}
