package com.ml.dao.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.dao.AssociatedTablesDao;
import com.ml.dto.ClassroomData;
import com.ml.dto.FacilityData;
import com.ml.dto.SubjectData;
import com.ml.dto.TeamMemberData;
import com.ml.entity.Subject;
import com.ml.utilities.DatabaseUtil;
import com.ml.utilities.DatabaseUtilities;

@SuppressWarnings("unchecked")
public class AssociatedTablesDaoImpl implements AssociatedTablesDao {

	private static final Logger LOG = LoggerFactory.getLogger(AssociatedTablesDaoImpl.class);
	private Session session;
	private Transaction tx;

	@Override
	public List<ClassroomData> listClassRooms() {
		try {
			session = DatabaseUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			tx.begin();
			Query query = session.createSQLQuery("select * from class_rooms")
					.setResultTransformer(Transformers.aliasToBean(ClassroomData.class));
			List<ClassroomData> listOfRooms = query.list();
			tx.commit();
			return listOfRooms;
		} catch (Exception e) {
			if (tx != null && !tx.wasCommitted())
				tx.rollback();
			LOG.error("exception ocuurred while fetching list of classrooms.");

			return Collections.emptyList();
		} finally {
			if (session != null && session.isOpen())
				session.close();
		}
	}

	@Override
	public List<SubjectData> listSubjects() {

		try {
			session = DatabaseUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			tx.begin();
			Query query = session.createSQLQuery("select * from specialities")
					.setResultTransformer(Transformers.aliasToBean(SubjectData.class));
			List<SubjectData> subjectList = query.list();
			tx.commit();

			return subjectList;

		} catch (Exception e) {
			if (tx != null && !tx.wasCommitted())
				tx.rollback();
			LOG.error("exception occurres while fetching list of subjects.");
			DatabaseUtilities.getDetailedStackTrace(e);

			return Collections.emptyList();
		} finally {
			if (session != null && session.isOpen())
				session.close();
		}
	}

	public List<TeamMemberData> listTeamMembers() {
		try {
			session = DatabaseUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			tx.begin();
			List<TeamMemberData> list = session.createSQLQuery("select * from teammembers")
					.setResultTransformer(Transformers.aliasToBean(TeamMemberData.class)).list();
			tx.commit();

			return list;

		} catch (Exception e) {
			if (tx != null && !tx.wasCommitted())
				tx.rollback();
			LOG.error("exception occurres while fetching list of team members.");
			DatabaseUtilities.getDetailedStackTrace(e);

			return Collections.emptyList();
		} finally {
			if (session != null && session.isOpen())
				session.close();
		}
	}

	@Override
	public List<FacilityData> listFacilities() {
		try {
			session = DatabaseUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			tx.begin();
			List<FacilityData> list = session.createSQLQuery("select * from facilities")
					.setResultTransformer(Transformers.aliasToBean(FacilityData.class)).list();
			tx.commit();

			return list;

		} catch (Exception e) {
			if (tx != null && !tx.wasCommitted())
				tx.rollback();
			LOG.error("exception occurres while fetching list of facilities.");
			DatabaseUtilities.getDetailedStackTrace(e);

			return Collections.emptyList();
		} finally {
			if (session != null && session.isOpen())
				session.close();
		}
	}

	@Override
	public List<List<String>> listClassroomsWithoutDTO() {
		try {
			session = DatabaseUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			tx.begin();
			/**
			 * Data has been saved in form of List<String>, and since in the table there can
			 * be more than one entries, in order to access it, a List of List of String
			 * will be needed.
			 */
			List<List<String>> classroomList = new ArrayList<>();
			List<Object[]> resultset = session.createSQLQuery("select * from class_rooms").list();
			for (Object[] row : resultset) { // each row is treated as an array of objects.
				List<String> classDetail = new ArrayList<>();
				for (Object column : row) { // each column is treated as an object.
					classDetail.add(String.valueOf(column));
				}
				classroomList.add(classDetail);
			}
			tx.commit();
			return classroomList;
		} catch (Exception e) {
			if (tx != null && !tx.wasCommitted())
				tx.rollback();
			LOG.error("exception ocuurred while fetching list of classrooms.");
			DatabaseUtilities.getDetailedStackTrace(e);

			return Collections.emptyList();
		} finally {
			if (session != null && session.isOpen())
				session.close();
		}
	}

	@Override
	public List<List<Subject>> listSubjectsWithoutDTO() {

		try {
			session = DatabaseUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			tx.begin();
			/**
			 * Data has been saved in form of List<String>, and since in the table there can
			 * be more than one entries, in order to access it, a List of List of String
			 * will be needed.
			 */
			List<List<Subject>> subjectList = new ArrayList<>();
			List<Object[]> resultset = session.createSQLQuery("select * from specialities").list();
			for (Object[] row : resultset) { // each row is treated as an array of objects.
				List<Subject> subjectName = new ArrayList<>();
				// ordinal value is stored in second column of the table specialities.
				int ordinalValue = Integer.parseInt(row[1].toString());
				Subject subject = Subject.values()[ordinalValue];
				subjectName.add(subject);
				subjectList.add(subjectName);
			}
			tx.commit();
			return subjectList;
		} catch (Exception e) {
			if (tx != null && !tx.wasCommitted())
				tx.rollback();
			LOG.error("exception occurres while fetching list of subjects.");
			DatabaseUtilities.getDetailedStackTrace(e);

			return Collections.emptyList();
		} finally {
			if (session != null && session.isOpen())
				session.close();
		}
	}

	public List<List<String>> listTeamMembersWithoutDTO() {

		try {
			session = DatabaseUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			tx.begin();
			List<List<String>> team = new ArrayList<>();
			List<Object[]> resultset = session.createSQLQuery("select * from teammembers").list();
			for (Object[] row : resultset) {
				List<String> teamDetails = new ArrayList<>();
				for (Object column : row) {
					teamDetails.add(String.valueOf(column));
				}
				team.add(teamDetails);
			}
			tx.commit();
			return team;
		} catch (Exception e) {
			if (tx != null && !tx.wasCommitted())
				tx.rollback();
			LOG.error("exception occurres while fetching list of team members.");
			DatabaseUtilities.getDetailedStackTrace(e);

			return Collections.emptyList();
		} finally {
			if (session != null && session.isOpen())
				session.close();
		}
	}

	@Override
	public List<List<String>> listFacilitiesWithoutDTO() {

		try {
			session = DatabaseUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			tx.begin();
			List<List<String>> facilities = new ArrayList<>();
			List<Object[]> resultset = session.createSQLQuery("select * from facilities").list();
			for (Object[] row : resultset) {
				List<String> facilityDetails = new ArrayList<>();
				for (Object column : row) {
					facilityDetails.add(String.valueOf(column));
				}
				facilities.add(facilityDetails);
			}
			tx.commit();
			return facilities;
		} catch (Exception e) {
			if (tx != null && !tx.wasCommitted())
				tx.rollback();
			LOG.error("exception occurres while fetching list of facilties.");
			DatabaseUtilities.getDetailedStackTrace(e);

			return Collections.emptyList();
		} finally {
			if (session != null && session.isOpen())
				session.close();
		}
	}

}
