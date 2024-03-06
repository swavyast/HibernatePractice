package com.ml.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.dao.PersonDao;
import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;
import com.ml.entity.Person;
import com.ml.utilities.DatabaseUtil;
import java.util.Collections;

public class PersonDaoImpl implements PersonDao {

	private static final SessionFactory factory = DatabaseUtil.getSessionFactory();
	private static final Logger LOG = LoggerFactory.getLogger(PersonDaoImpl.class);

	@Override
	public void savePerson(Person person) {
		try {
			Session session = factory.openSession();
			Transaction tx = session.getTransaction();
			tx.begin();
			LOG.info("Saving Person instance...");
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
			LOG.error(message.toString());
		}

	}

	@Override
	public Person getPersonByPersonId(String pid) {

		return null;
	}

	@Override
	public Person getPersonByName(String name) {

		return null;
	}

	@Override
	public List<Person> getPersonByFatherName(String fatherName) {

		return Collections.emptyList();
	}

	@Override
	public List<Person> getPersonByMoherName(String motherName) {

		return Collections.emptyList();
	}

	@Override
	public List<Person> getPersonByDateOfBirth(String dob) {

		return Collections.emptyList();
	}

	@Override
	public List<Person> getPersonByAge(String age) {

		return Collections.emptyList();
	}

	@Override
	public List<Person> getPersonByGender(Gender gender) {

		return Collections.emptyList();
	}

	@Override
	public List<Person> getPersonByEthnicity(Ethnicity ethnicity) {

		return Collections.emptyList();
	}

	@Override
	public List<Person> getPersonByGender(String gender) {

		return Collections.emptyList();
	}

	@Override
	public List<Person> getPersonByEthnicity(String ethnicity) {

		return Collections.emptyList();
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
			LOG.info("Fetching list of Person(s)");
			return li;
		} catch (Exception e) {
			String msg = e.getMessage();
			StringBuilder message = new StringBuilder(msg);
			Throwable cause = e.getCause();
			while (cause != null) {
				message = message.append(e.getMessage().toCharArray());
				cause = cause.getCause();
			}
			LOG.error(message.toString());

			return Collections.emptyList();
		}
	}

}
