package com.ml.m2mMapping;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CreateStudent {

	public static void main(String[] args) {
		try {
		Transaction tx=null;
		SessionFactory sessF=DatabaseConfig.getSessionFactory();
		Session session= sessF.openSession();
		tx=session.beginTransaction();
		Student amit=new Student();
		amit.setName("Amit Shukla");
		amit.setEmail("akshuklait@gmail.com");
		amit.setPhone(9898586329L);
		amit.setFee(35000.00);
		Address a=new Address("E-7/22", "Sector-22", "Noida", "Gautam Budh Nagar", 
				"Uttar Pradesh", "India", 201301, amit);
		amit.setAddress(a);
		Course java=new Course();
		java.setCourseName("java Full Stack");
		java.setTutor("Raghawenra Pratap Singh");
		java.setDuration("10 Months");
		java.setBatchTiming("10 Am - 2pm, Monday - Friday");
		java.setStudent(Arrays.asList(amit));
		List<Course> myCourses=Arrays.asList(java);
		amit.setCourses(myCourses);
		session.save(a);
		session.save(java);
		session.save(amit);
		tx.commit();
		session.close();
		}catch (Exception e) {
			System.out.println("Exception occured while creating either Student, Address or Course object.. "
					+ "check your logs accoringly");
			e.printStackTrace();
		}
	}

}
