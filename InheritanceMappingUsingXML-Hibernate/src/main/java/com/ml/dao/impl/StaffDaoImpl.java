package com.ml.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.dao.EmployeeDao;
import com.ml.dao.PersonDao;
import com.ml.dao.StaffDao;
import com.ml.entity.Employee;
import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;
import com.ml.entity.Person;
import com.ml.entity.Staff;
import com.ml.utilities.DatabaseUtility;

public class StaffDaoImpl implements StaffDao {

	private static final SessionFactory FACTORY = DatabaseUtility.getSessionFactory();
	private static final Logger LOGGER = LoggerFactory.getLogger(StaffDaoImpl.class);

	@Override
	public void saveStaff(Staff staff) {
		try {
			Session session = FACTORY.openSession();
			Transaction tx = session.getTransaction();
			Person p = new Person(staff.getName(), staff.getDob(), staff.getAge(), staff.getFatherName(), staff.getMotherName(), staff.getGender(), staff.getEthnicity());
			Employee emp = new Employee(p, staff.getSalary(), staff.getBonus(), staff.getAnnualLeaves(),
					staff.getLeaveWithoutPay());
			new EmployeeDaoImpl().saveEmployee(emp);
			tx.begin();
			Serializable s = session.save(staff);
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
	public Staff getStaffById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Staff> getStaffByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Staff> getStaffByDepartment(String department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getManagerName(Staff staff) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Staff> getStaffByPosition(String position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAllTeamMembers(Staff staff) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Staff> getStaffByFatherName(String fatherName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Staff> getStaffByMotherName(String motherName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Staff> getStaffByDateOfBirth(String dob) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Staff> getStaffByAge(String age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Staff> getStaffByGender(Gender gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Staff> getStaffByEthnicity(Ethnicity ethnicity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Staff> getStaffByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Staff> getStaffByEthnicity(String ethnicity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Staff> getAllStaff() {
		// TODO Auto-generated method stub
		return null;
	}

}
