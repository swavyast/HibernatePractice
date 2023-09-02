package hibernate_01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ClientOne {
	public static void main(String[] args) {
		try{
		Transaction tx=null;
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		tx=session.beginTransaction();
		Customer cust=new Customer("himanshu", 29, "swavyast@gmail.com", 7275855535L, "Noida", 100000.006 );
		System.out.println("Testing save transaction : "+session.save(cust));
		tx.commit();
		session.close();
		System.out.println("Customer Record Inserted Successfully");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
