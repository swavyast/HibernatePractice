package com.ml.dao.impl;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.dao.StaffDao;
import com.ml.entity.Employee;
import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;
import com.ml.entity.Person;
import com.ml.entity.Staff;
import com.ml.utilities.DatabaseUtil;

public class StaffDaoImpl implements StaffDao {

	private static final SessionFactory FACTORY = DatabaseUtil.getSessionFactory();
	private static final Logger LOG = LoggerFactory.getLogger(StaffDaoImpl.class);

	@Override
	public void saveStaff(Staff staff) {
		try {
			Session session = FACTORY.openSession();
			Transaction tx = session.getTransaction();
			Person p = new Person(staff.getName(), staff.getDob(), staff.getAge(), staff.getFatherName(),
					staff.getMotherName(), staff.getGender(), staff.getEthnicity());
			Employee emp = new Employee(p, staff.getSalary(), staff.getBonus(), staff.getAnnualLeaves(),
					staff.getLeaveWithoutPay());
			LOG.info("Saving Employee instance along with it's personal records");
			new EmployeeDaoImpl().saveEmployee(emp);
			tx.begin();
			Serializable s = session.save(staff);
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
	public Staff getStaffByStaffId(String sid) {

		return null;
	}

	@Override
	public List<Staff> getStaffByName(String name) {

		return Collections.emptyList();
	}

	@Override
	public List<Staff> getStaffByDepartment(String department) {

		return Collections.emptyList();
	}

	@Override
	public String getManagerName(Staff staff) {

		return null;
	}

	@Override
	public List<Staff> getStaffByPosition(String position) {

		return Collections.emptyList();
	}

	@Override
	public List<String> getAllTeamMembers(Staff staff) {

		return Collections.emptyList();
	}

	@Override
	public List<Staff> getStaffByFatherName(String fatherName) {

		return Collections.emptyList();
	}

	@Override
	public List<Staff> getStaffByMotherName(String motherName) {

		return Collections.emptyList();
	}

	@Override
	public List<Staff> getStaffByDateOfBirth(String dob) {

		return Collections.emptyList();
	}

	@Override
	public List<Staff> getStaffByAge(String age) {

		return Collections.emptyList();
	}

	@Override
	public List<Staff> getStaffByGender(Gender gender) {

		return Collections.emptyList();
	}

	@Override
	public List<Staff> getStaffByEthnicity(Ethnicity ethnicity) {

		return Collections.emptyList();
	}

	@Override
	public List<Staff> getStaffByGender(String gender) {

		return Collections.emptyList();
	}

	@Override
	public List<Staff> getStaffByEthnicity(String ethnicity) {

		return Collections.emptyList();
	}

	@Override
	public List<Staff> getAllStaff() {

		return Collections.emptyList();
	}

}
