package com.ml.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.dao.PersonDao;
import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;
import com.ml.entity.Person;
import com.ml.utilities.DatabaseUtil;
import com.ml.utilities.DatabaseUtilities;

import java.util.Collections;

@SuppressWarnings("unchecked")
public class PersonDaoImpl implements PersonDao {

	private static final SessionFactory FACTORY = DatabaseUtil.getSessionFactory();
	private Session session;
	private Transaction tx;
	private static final Logger LOG = LoggerFactory.getLogger(PersonDaoImpl.class);

	@Override
	public void savePerson(Person person) {
		try {
			if (person != null && FACTORY != null) {
				session = FACTORY.getCurrentSession();
				tx = session.getTransaction();
				tx.begin();
				LOG.info("saving personal details...");
				session.save(person);
				tx.commit();
			} else {
				if (person == null)
					LOG.error("person instance is null...");
				if (FACTORY == null)
					LOG.error("factory instance is null. session factory may not have been initialized properly.");
			}
		} catch (Exception e) {
			if (tx != null && !tx.wasCommitted())
				tx.rollback();
			LOG.error("exception occurred while saving person instance.");
			DatabaseUtilities.getDetailedStackTrace(e);
		} finally {
			if (session != null && session.isOpen())
				session.close();
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
	public List<Person> getPeopleByFatherName(String fatherName) {

		return Collections.emptyList();
	}

	@Override
	public List<Person> getPeopleByMotherName(String motherName) {

		return Collections.emptyList();
	}

	@Override
	public List<Person> getPeopleByDateOfBirth(String dob) {

		return Collections.emptyList();
	}

	@Override
	public List<Person> getPeopleByAge(String age) {

		return Collections.emptyList();
	}

	@Override
	public List<Person> getPeopleByGender(Gender gender) {

		return Collections.emptyList();
	}

	@Override
	public List<Person> getPeopleByEthnicity(Ethnicity ethnicity) {

		return Collections.emptyList();
	}

	@Override
	public List<Person> getPeopleByGender(String gender) {

		return Collections.emptyList();
	}

	@Override
	public List<Person> getPeopleByEthnicity(String ethnicity) {

		return Collections.emptyList();
	}

	@Override
	public List<Person> getAllPeople() {
		try {
			session = FACTORY.getCurrentSession();
			tx = session.getTransaction();
			tx.begin();
			List<Person> li = session.createCriteria(Person.class).list();
			if (!tx.wasCommitted())
				tx.commit();
			LOG.info("Fetching list of Person(s)");
			return li;
		} catch (Exception e) {
			if (tx != null && !tx.wasCommitted())
				tx.rollback();
			LOG.error("Exception occured while fetching Persons' list");
			DatabaseUtilities.getDetailedStackTrace(e);

			return Collections.emptyList();
		} finally {
			if (session != null && session.isOpen())
				session.close();
		}
	}

	public static <T extends Person> void savePersonalDetails(T t) {
		if (t != null && hasPersonalDetails(t)) {

			Person p = new Person(t.getName(), t.getFatherName(), t.getMotherName(), t.getDob(), t.getAge(),
					t.getGender(), t.getEthnicity());
			new PersonDaoImpl().savePerson(p);
		}
	}

	private static <T extends Person> boolean hasPersonalDetails(T t) {

		return t.getName() != null && t.getFatherName() != null && t.getMotherName() != null && t.getDob() != null
				&& t.getAge() != null && t.getGender() != null && t.getEthnicity() != null;
	}

}
