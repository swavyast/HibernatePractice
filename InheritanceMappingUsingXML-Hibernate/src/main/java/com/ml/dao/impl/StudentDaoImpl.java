package com.ml.dao.impl;

import java.util.Collections;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import com.ml.dao.StudentDao;
import com.ml.entity.Employee;
import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;
import com.ml.entity.Student;
import com.ml.utilities.DatabaseUtil;
import com.ml.utilities.DatabaseUtilities;

public class StudentDaoImpl implements StudentDao {

	private static final SessionFactory FACTORY = DatabaseUtil.getSessionFactory();
	private Session session;
	private Transaction tx;
	private static final Logger LOG = LoggerFactory.getLogger(StudentDaoImpl.class);
	private static final Marker FATAL = MarkerFactory.getMarker("FATAL");

	@Override
	public void saveStudent(Student student) {

		try {
			PersonDaoImpl.savePersonalDetails(student);
			session = FACTORY.getCurrentSession();
			tx = session.beginTransaction();
			tx.begin();
			LOG.info("saving student details...");
			session.save(student);
			tx.commit();
		} catch (Exception e) {
			if (tx != null && !tx.wasCommitted())
				tx.rollback();
			LOG.error(FATAL, "Exception occured while saving student instance.");
			DatabaseUtilities.getDetailedStackTrace(e);
		} finally {
			if (session != null && session.isOpen())
				session.close();
		}

	}

	@Override
	public Student getStudentByStudentId(String sid) {

		return null;
	}

	@Override
	public Student getStudentByName(String name) {

		return null;
	}

	@Override
	public Student getStudentByEmail(String email) {

		return null;
	}

	@Override
	public Student getStudentByEnrollmentId(String enrollmentId) {

		return null;
	}

	@Override
	public List<Student> getStudentsByBatchName(String batch) {

		return Collections.emptyList();
	}

	@Override
	public List<Student> getStudentsByFatherName(String fatherName) {

		return Collections.emptyList();
	}

	@Override
	public List<Student> getStudentsByMotherName(String motherName) {

		return Collections.emptyList();
	}

	@Override
	public List<Student> getStudentsByDateOfBirth(String dob) {

		return Collections.emptyList();
	}

	@Override
	public List<Student> getStudentsByAge(String age) {

		return Collections.emptyList();
	}

	@Override
	public List<Student> getStudentsByGender(Gender gender) {

		return Collections.emptyList();
	}

	@Override
	public List<Student> getStudentsByEthnicity(Ethnicity ethnicity) {

		return Collections.emptyList();
	}

	@Override
	public List<Student> getStudentsByGender(String gender) {

		return Collections.emptyList();
	}

	@Override
	public List<Student> getStudentsByEthnicity(String ethnicity) {

		return Collections.emptyList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getAllStudents() {
		try {
			session = FACTORY.getCurrentSession();
			tx = session.getTransaction();
			tx.begin();
			List<Student> li = session.createCriteria(Student.class).list();
			tx.commit();
			LOG.info("Fetching list of Student(s)");
			return li;
		} catch (Exception e) {
			if (tx != null && !tx.wasCommitted())
				tx.rollback();
			LOG.error(FATAL, "exception occurred while fetching the student list.");
			DatabaseUtilities.getDetailedStackTrace(e);

			return Collections.emptyList();
		} finally {
			if (session != null && session.isOpen())
				session.close();
		}
	}

}
