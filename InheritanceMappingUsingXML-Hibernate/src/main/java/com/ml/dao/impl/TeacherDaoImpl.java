package com.ml.dao.impl;

import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.dao.TeacherDao;
import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;
import com.ml.entity.ModeOfTeaching;
import com.ml.entity.Subject;
import com.ml.entity.Teacher;
import com.ml.utilities.DatabaseUtil;
import com.ml.utilities.DatabaseUtilities;

public class TeacherDaoImpl implements TeacherDao {

	private static final SessionFactory FACTORY = DatabaseUtil.getSessionFactory();
	private Session session;
	private Transaction tx;
	private static final Logger LOG = LoggerFactory.getLogger(TeacherDaoImpl.class);

	@Override
	public void saveTeacher(Teacher teacher) {
		try {
			PersonDaoImpl.savePersonalDetails(teacher);
			EmployeeDaoImpl.saveEmploymentDetails(teacher);
			StaffDaoImpl.saveStaffDetails(teacher);
			session = FACTORY.getCurrentSession();
			tx = session.getTransaction();
			tx.begin();
			LOG.info("saving teacher instance...");
			session.save(teacher);
			tx.commit();
		} catch (Exception e) {
			if (tx != null && !tx.wasCommitted())
				tx.rollback();
			LOG.error("exception occurred while saving teacher instance");
			DatabaseUtilities.getDetailedStackTrace(e);
		} finally {
			if (session != null && (session.isOpen()))
				session.close();
		}

	}

	@Override
	public Teacher getTeacherByTeacherId(String tid) {

		return null;
	}

	@Override
	public String getManagerName(Teacher teacher) {

		return null;
	}

	@Override
	public List<String> getAllTeamMembers(Teacher teacher) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherListByName(String name) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherListByDepartment(String department) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherListBySpecialities(Subject specialities) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherListByClassroom(String classRoom) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherListByModeOfTeaching(ModeOfTeaching modeOfTeaching) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherListByPosition(String position) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherListByFatherName(String fatherName) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherListByMotherName(String motherName) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherListByDateOfBirth(String dob) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherListByAge(String age) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherListByGender(Gender gender) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherListByEthnicity(Ethnicity ethnicity) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherListByGender(String gender) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherListByEthnicity(String ethnicity) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getAllTeachers() {
		try {
			session = FACTORY.getCurrentSession();
			tx = session.getTransaction();
			tx.begin();
			@SuppressWarnings("unchecked")
			List<Teacher> li = session.createCriteria(Teacher.class).list();
			tx.commit();
			LOG.info("Fetching list of Teacher(s)");
			return li;
		} catch (Exception e) {
			if (tx != null && !tx.wasCommitted())
				tx.rollback();
			LOG.error("Exception occured while fetching Teachers' list");
			DatabaseUtilities.getDetailedStackTrace(e);

			return Collections.emptyList();
		} finally {
			if (session != null && (session.isOpen()))
				session.close();
		}
	}

}
