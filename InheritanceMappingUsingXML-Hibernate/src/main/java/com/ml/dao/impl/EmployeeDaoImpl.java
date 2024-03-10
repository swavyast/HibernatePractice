package com.ml.dao.impl;

import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.dao.EmployeeDao;
import com.ml.entity.Employee;
import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;
import com.ml.utilities.DatabaseUtil;
import com.ml.utilities.DatabaseUtilities;

@SuppressWarnings("unchecked")
public class EmployeeDaoImpl implements EmployeeDao {

	private static final SessionFactory FACTORY = DatabaseUtil.getSessionFactory();
	private static final Logger LOG = LoggerFactory.getLogger(EmployeeDaoImpl.class);
	private Session session;
	private Transaction tx;

	@Override
	public void saveEmployee(Employee employee) {

		try {
			PersonDaoImpl.savePersonalDetails(employee);
			if (employee != null && FACTORY != null) {
				session = FACTORY.getCurrentSession();
				tx = session.getTransaction();
				tx.begin();
				LOG.info("saving employment details...");
				session.save(employee);
				tx.commit();
			} else {
				if (employee == null)
					LOG.error("employee instance is null...");
				if (FACTORY == null)
					LOG.error("factory instance is null. session factory may not have been initialized properly.");
			}

		} catch (Exception e) {
			if (tx != null && !tx.wasCommitted())
				tx.rollback();
			LOG.error("exception occurred while saving employee instance.");
			DatabaseUtilities.getDetailedStackTrace(e);
		} finally {
			if (session != null && session.isOpen())
				session.close();
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
	public List<Employee> getEmployeeListByFatherName(String fatherName) {

		return Collections.emptyList();
	}

	@Override
	public List<Employee> getEmployeeListByMotherName(String motherName) {

		return Collections.emptyList();
	}

	@Override
	public List<Employee> getEmployeeListByDateOfBirth(String dob) {

		return Collections.emptyList();
	}

	@Override
	public List<Employee> getEmployeeListByAge(String age) {

		return Collections.emptyList();
	}

	@Override
	public List<Employee> getEmployeeListByGender(Gender gender) {

		return Collections.emptyList();
	}

	@Override
	public List<Employee> getEmployeeListByEthnicity(Ethnicity ethnicity) {

		return Collections.emptyList();
	}

	@Override
	public List<Employee> getEmployeeListByGender(String gender) {

		return Collections.emptyList();
	}

	@Override
	public List<Employee> getEmployeeListByEthnicity(String ethnicity) {

		return Collections.emptyList();
	}

	@Override
	public List<Employee> getAllEmployees() {
		try {
			session = FACTORY.getCurrentSession();
			tx = session.getTransaction();
			tx.begin();
			List<Employee> li = session.createCriteria(Employee.class).list();
			tx.commit();
			LOG.info("Fetching list of Employee(s)");
			return li;
		} catch (Exception e) {
			if (tx != null && !tx.wasCommitted())
				tx.rollback();
			LOG.error("Exception occured while fetching Employees' list");

			DatabaseUtilities.getDetailedStackTrace(e);
			return Collections.emptyList();
		} finally {
			if (session != null && session.isOpen())
				session.close();
		}
	}

	public static <T extends Employee> void saveEmploymentDetails(T t) {
		if (t != null && hasEmploymentDetails(t)) {
			Employee e = new Employee(t.getSalary(), t.getBonus(), t.getAnnualLeaves(), t.getLeaveWithoutPay());
			new EmployeeDaoImpl().saveEmployee(e);
		}

	}

	private static <T extends Employee> boolean hasEmploymentDetails(T t) {

		return t.getSalary() != null && t.getBonus() != null && t.getAnnualLeaves() != null
				&& t.getLeaveWithoutPay() != null;
	}
}
