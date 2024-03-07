package com.ml.dao.impl;

import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.dao.StaffDao;
import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;
import com.ml.entity.Staff;
import com.ml.utilities.DatabaseUtil;
import com.ml.utilities.DatabaseUtilities;

public class StaffDaoImpl implements StaffDao {

	private static final SessionFactory FACTORY = DatabaseUtil.getSessionFactory();
	private Session session;
	private Transaction tx;
	private static final Logger LOG = LoggerFactory.getLogger(StaffDaoImpl.class);

	@Override
	public void saveStaff(Staff staff) {
		try {
			PersonDaoImpl.savePersonalDetails(staff);
			EmployeeDaoImpl.saveEmploymentDetails(staff);
			if (staff != null && FACTORY != null) {
				session = FACTORY.getCurrentSession();
				tx = session.getTransaction();
				tx.begin();
				LOG.info("saving staff details...");
				session.save(staff);
				tx.commit();
			} else {
				if (staff == null)
					LOG.error("staff instance is null");
				if (FACTORY == null)
					LOG.error("factory instance is null. session factory may not have been initialized properly.");
			}
		} catch (Exception e) {
			if (tx != null && !tx.wasCommitted())
				tx.rollback();
			LOG.error("exception occurred while saving staff instance");
			DatabaseUtilities.getDetailedStackTrace(e);
		} finally {
			if (session != null && (session.isOpen()))
				session.close();
		}

	}

	@Override
	public Staff getStaffByStaffId(String sid) {

		return null;
	}

	@Override
	public String getManagerName(Staff staff) {

		return null;
	}

	@Override
	public List<String> getAllTeamMembers(Staff staff) {

		return Collections.emptyList();
	}

	@Override
	public List<Staff> getStaffListByName(String name) {

		return Collections.emptyList();
	}

	@Override
	public List<Staff> getStaffListByDepartment(String department) {

		return Collections.emptyList();
	}

	@Override
	public List<Staff> getStaffListByPosition(String position) {

		return Collections.emptyList();
	}

	@Override
	public List<Staff> getStaffListByFatherName(String fatherName) {

		return Collections.emptyList();
	}

	@Override
	public List<Staff> getStaffListByMotherName(String motherName) {

		return Collections.emptyList();
	}

	@Override
	public List<Staff> getStaffListByDateOfBirth(String dob) {

		return Collections.emptyList();
	}

	@Override
	public List<Staff> getStaffListByAge(String age) {

		return Collections.emptyList();
	}

	@Override
	public List<Staff> getStaffListByGender(Gender gender) {

		return Collections.emptyList();
	}

	@Override
	public List<Staff> getStaffListByEthnicity(Ethnicity ethnicity) {

		return Collections.emptyList();
	}

	@Override
	public List<Staff> getStaffListByGender(String gender) {

		return Collections.emptyList();
	}

	@Override
	public List<Staff> getStaffListByEthnicity(String ethnicity) {

		return Collections.emptyList();
	}

	@Override
	public List<Staff> getAllStaffs() {
		try {
			session = FACTORY.getCurrentSession();
			tx = session.getTransaction();
			tx.begin();
			@SuppressWarnings("unchecked")
			List<Staff> li = session.createCriteria(Staff.class).list();
			tx.commit();
			LOG.info("Fetching list of Staff(s)");
			return li;
		} catch (Exception e) {
			if (tx != null && !tx.wasCommitted())
				tx.rollback();
			LOG.error("Exception occured while fetching Staffs' list");
			DatabaseUtilities.getDetailedStackTrace(e);

			return Collections.emptyList();
		} finally {
			if (session != null && (session.isOpen()))
				session.close();
		}
	}

	public static <T extends Staff> void saveStaffDetails(T t) {
		if (t != null && hasStaffDetails(t)) {

			Staff s = new Staff(t.getDepartment(), t.getManager(), t.getTeamMembers(), t.getPosition(),
					t.getCanAccess());
			new StaffDaoImpl().saveStaff(s);
		}

	}

	private static <T extends Staff> boolean hasStaffDetails(T t) {

		return t.getDepartment() != null && t.getManager() != null && t.getTeamMembers() != null
				&& t.getPosition() != null && t.getCanAccess() != null;
	}
}
