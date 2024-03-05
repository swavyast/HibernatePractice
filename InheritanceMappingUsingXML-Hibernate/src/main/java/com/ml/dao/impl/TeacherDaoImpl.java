package com.ml.dao.impl;

import java.io.Serializable;
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
import com.ml.utilities.DatabaseUtility;

public class TeacherDaoImpl implements TeacherDao {

	private static final SessionFactory FACTORY = DatabaseUtility.getSessionFactory();
	private static final Logger LOGGER = LoggerFactory.getLogger(TeacherDaoImpl.class);

	@Override
	public void saveTeacher(Teacher teacher) {
		try {
			Session session = FACTORY.openSession();
			Transaction tx = session.getTransaction();
			Person p = new Person(teacher.getName(), teacher.getDob(), teacher.getAge(), teacher.getFatherName(),
					teacher.getMotherName(), teacher.getGender(), teacher.getEthnicity());
			Employee emp = new Employee(p, teacher.getSalary(), teacher.getBonus(), teacher.getAnnualLeaves(),
					teacher.getLeaveWithoutPay());
			Staff staff = new Staff(p, emp, teacher.getDepartment(), teacher.getReportsTo(), teacher.getTeamMembers(),
					teacher.getPosition(), teacher.getCanAccess());
			new StaffDaoImpl().saveStaff(staff);
			tx.begin();
			Serializable s = session.save(teacher);
			System.out.println(s);
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
	public Teacher getTeacherById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getTeacherByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getTeacherByDepartment(String department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getTeacherBySpecialities(Subject specialities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getTeacherByClassroom(String classRoom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getTeacherByModeOfTeaching(ModeOfTeaching modeOfTeaching) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getManagerName(Teacher teacher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getTeacherByPosition(String position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAllTeamMembers(Teacher teacher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getTeacherByFatherName(String fatherName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getTeacherByMotherName(String motherName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getTeacherByDateOfBirth(String dob) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getTeacherByAge(String age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getTeacherByGender(Gender gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getTeacherByEthnicity(Ethnicity ethnicity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getTeacherByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getTeacherByEthnicity(String ethnicity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getAllTeachers() {
		// TODO Auto-generated method stub
		return null;
	}

}
