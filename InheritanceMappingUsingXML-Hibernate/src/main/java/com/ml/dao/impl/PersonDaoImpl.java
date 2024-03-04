package com.ml.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.client.SavePerson;
import com.ml.dao.PersonDao;
import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;
import com.ml.entity.Person;
import com.ml.utilities.DatabaseUtility;

public class PersonDaoImpl implements PersonDao {

	private static final SessionFactory factory = DatabaseUtility.getSessionFactory();
	private static final Logger LOGGER = LoggerFactory.getLogger(PersonDaoImpl.class);

	@Override
	public void savePerson(Person person) {
		try {
			Session session = factory.openSession();
			Transaction tx = session.getTransaction();
			tx.begin();
			session.save(person);
			tx.commit();
			session.close();
		} catch (Exception e) {
			String msg = e.getMessage();
			StringBuilder message = new StringBuilder(msg);
			Throwable cause = e.getCause();
			while (cause != null) {
				message = message.append(e.getMessage().toCharArray());
				cause = cause.getCause();
			}
			LOGGER.error(message.toString());
		}

	}

	@Override
	public Person getPersonById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person getPersonByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getPersonByFatherName(String fatherName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getPersonByMoherName(String MotherName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getPersonByDateOfBirth(String dob) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getPersonByAge(String age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getPersonByGender(Gender gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getPersonByEthnicity(Ethnicity ethnicity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getPersonByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getPersonByEthnicity(String ethnicity) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> getAllPerson() {
		try {
			Session session = factory.openSession();
			Transaction tx = session.getTransaction();
			tx.begin();
			Criteria c = session.createCriteria(Person.class);
			c.add(Restrictions.eq("gender", Gender.MALE));
			c.add(Restrictions.eq("ethnicity", Ethnicity.ASIAN));
			c.setMaxResults(10);
			List<Person> li = c.list();
			System.out.println(li.size());
			return li;
		} catch (Exception e) {
			String msg = e.getMessage();
			StringBuilder message = new StringBuilder(msg);
			Throwable cause = e.getCause();
			while (cause != null) {
				message = message.append(e.getMessage().toCharArray());
				cause = cause.getCause();
			}
			LOGGER.error(message.toString());
			
			return null;
		}
	}

}
