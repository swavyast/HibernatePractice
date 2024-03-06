package com.ml.dao.impl;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.dao.TeacherDao;
import com.ml.entity.Employee;
import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;
import com.ml.entity.ModeOfTeaching;
import com.ml.entity.Person;
import com.ml.entity.Staff;
import com.ml.entity.Subject;
import com.ml.entity.Teacher;
import com.ml.utilities.DatabaseUtil;

public class TeacherDaoImpl implements TeacherDao {

	private static final SessionFactory FACTORY = DatabaseUtil.getSessionFactory();
	private static final Logger LOG = LoggerFactory.getLogger(TeacherDaoImpl.class);

	@Override
	public void saveTeacher(Teacher teacher) {
		try {
			Session session = FACTORY.openSession();
			Transaction tx = session.getTransaction();
			/*
			 * Person p = new Person(teacher.getName(), teacher.getDob(), teacher.getAge(),
			 * teacher.getFatherName(), teacher.getMotherName(), teacher.getGender(),
			 * teacher.getEthnicity()); Employee emp = new Employee(p, teacher.getSalary(),
			 * teacher.getBonus(), teacher.getAnnualLeaves(), teacher.getLeaveWithoutPay());
			 * Staff staff = new Staff(p, emp, teacher.getDepartment(),
			 * teacher.getManager(), teacher.getTeamMembers(), teacher.getPosition(),
			 * teacher.getCanAccess()); LOG.
			 * info("Saving staff instance along with it's personal records and employment details"
			 * ); new StaffDaoImpl().saveStaff(staff);
			 */
			tx.begin();
			Serializable s = session.save(teacher);
			if (LOG.isInfoEnabled())
				LOG.info(s.toString());
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
	public Teacher getTeacherByTeacherId(String tid) {

		return null;
	}

	@Override
	public List<Teacher> getTeacherByName(String name) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherByDepartment(String department) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherBySpecialities(Subject specialities) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherByClassroom(String classRoom) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherByModeOfTeaching(ModeOfTeaching modeOfTeaching) {

		return Collections.emptyList();
	}

	@Override
	public String getManagerName(Teacher teacher) {

		return null;
	}

	@Override
	public List<Teacher> getTeacherByPosition(String position) {

		return Collections.emptyList();
	}

	@Override
	public List<String> getAllTeamMembers(Teacher teacher) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherByFatherName(String fatherName) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherByMotherName(String motherName) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherByDateOfBirth(String dob) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherByAge(String age) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherByGender(Gender gender) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherByEthnicity(Ethnicity ethnicity) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherByGender(String gender) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getTeacherByEthnicity(String ethnicity) {

		return Collections.emptyList();
	}

	@Override
	public List<Teacher> getAllTeachers() {

		return Collections.emptyList();
	}

}
