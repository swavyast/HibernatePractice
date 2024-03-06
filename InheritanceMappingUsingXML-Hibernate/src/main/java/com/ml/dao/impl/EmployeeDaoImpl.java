package com.ml.dao.impl;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.dao.EmployeeDao;
import com.ml.dao.PersonDao;
import com.ml.entity.Employee;
import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;
import com.ml.entity.Person;
import com.ml.utilities.DatabaseUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	private static final SessionFactory FACTORY = DatabaseUtil.getSessionFactory();
	private static final Logger LOG = LoggerFactory.getLogger(EmployeeDaoImpl.class);

	@Override
	public void saveEmployee(Employee employee) {

		try {
			Session session = FACTORY.openSession();
			Transaction tx = session.getTransaction();
			Person p = new Person();
			PersonDao pdao = new PersonDaoImpl();
			p.setName(employee.getName());
			p.setDob(employee.getDob());
			p.setAge(employee.getAge());
			p.setEthnicity(employee.getEthnicity());
			p.setFatherName(employee.getFatherName());
			p.setGender(employee.getGender());
			p.setMotherName(employee.getMotherName());
			LOG.info("Saving Personal Records...");
			pdao.savePerson(p);
			tx.begin();
			Serializable s = session.save(employee);
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
	public Employee getEmployeeByEmployeeId(String eid) {

		return null;
	}

	@Override
	public Employee getEmployeeByName(String name) {

		return null;
	}

	@Override
	public List<Employee> getEmployeeByFatherName(String fatherName) {

		return Collections.emptyList();
	}

	@Override
	public List<Employee> getEmployeeByMoherName(String motherName) {

		return Collections.emptyList();
	}

	@Override
	public List<Employee> getEmployeeByDateOfBirth(String dob) {

		return Collections.emptyList();
	}

	@Override
	public List<Employee> getEmployeeByAge(String age) {

		return Collections.emptyList();
	}

	@Override
	public List<Employee> getEmployeeByGender(Gender gender) {

		return Collections.emptyList();
	}

	@Override
	public List<Employee> getEmployeeByEthnicity(Ethnicity ethnicity) {

		return Collections.emptyList();
	}

	@Override
	public List<Employee> getEmployeeByGender(String gender) {

		return Collections.emptyList();
	}

	@Override
	public List<Employee> getEmployeeByEthnicity(String ethnicity) {

		return Collections.emptyList();
	}

	@Override
	public List<Employee> getAllEmployee() {

		return Collections.emptyList();
	}

}
