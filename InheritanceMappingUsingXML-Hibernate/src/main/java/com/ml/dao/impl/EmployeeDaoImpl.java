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
import com.ml.entity.Employee;
import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;
import com.ml.entity.Person;
import com.ml.utilities.DatabaseUtility;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private static final SessionFactory FACTORY = DatabaseUtility.getSessionFactory();
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDaoImpl.class);

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
			pdao.savePerson(p);
			tx.begin();
			Serializable s = session.save(employee);
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
	public Employee getEmployeeById(String id) {

		return null;
	}

	@Override
	public Employee getEmployeeByName(String name) {

		return null;
	}

	@Override
	public List<Employee> getEmployeeByFatherName(String fatherName) {

		return null;
	}

	@Override
	public List<Employee> getEmployeeByMoherName(String MotherName) {

		return null;
	}

	@Override
	public List<Employee> getEmployeeByDateOfBirth(String dob) {

		return null;
	}

	@Override
	public List<Employee> getEmployeeByAge(String age) {

		return null;
	}

	@Override
	public List<Employee> getEmployeeByGender(Gender gender) {

		return null;
	}

	@Override
	public List<Employee> getEmployeeByEthnicity(Ethnicity ethnicity) {

		return null;
	}

	@Override
	public List<Employee> getEmployeeByGender(String gender) {

		return null;
	}

	@Override
	public List<Employee> getEmployeeByEthnicity(String ethnicity) {

		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {

		return null;
	}

}
