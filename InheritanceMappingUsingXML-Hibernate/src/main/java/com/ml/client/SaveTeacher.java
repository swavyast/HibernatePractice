package com.ml.client;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.dao.TeacherDao;
import com.ml.dao.impl.TeacherDaoImpl;
import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;
import com.ml.entity.ModeOfTeaching;
import com.ml.entity.Subject;
import com.ml.entity.Teacher;

public class SaveTeacher {

	private static final Logger LOG = LoggerFactory.getLogger(SaveTeacher.class);

	public static void main(String[] args) {
		TeacherDao tdao = new TeacherDaoImpl();
		Teacher teacher = new Teacher();
		teacher.setName("Himanshu RAi");
		teacher.setFatherName("D. K. Rai");
		teacher.setMotherName("Nilam Rai");
		teacher.setGender(Gender.MALE);
		teacher.setAge("30");
		teacher.setEthnicity(Ethnicity.CAUCASIAN);
		teacher.setDob("01-July-1994");
		teacher.setSalary(56572.369);
		teacher.setBonus(12346.689);
		teacher.setAnnualLeaves(20);
		teacher.setLeaveWithoutPay(30);
		teacher.setDepartment("IT/Software");
		teacher.setPosition("Java Developer");
		teacher.setManager("Manager");
		teacher.setTeamMembers(Arrays.asList("Abhijeet Singh", "Animesh Prajapati", "Munn Jangid"));
		Set<String> set = new HashSet<>();
		set.add("ClassRoom");
		set.add("Admin Cell");
		set.add("Auditorium");
		set.add("Control Room");
		set.add("H.O.D. Office");
		set.add("V. C. Office");
		teacher.setCanAccess(set);
		List<Subject> specs = Arrays.asList(Subject.SCIENCE, Subject.STATISTICS, Subject.MATHEMATICS);
		teacher.setSpecialities(specs);
		List<String> classrooms = Arrays.asList("CR-A101", "CR-B306", "CR-C002");
		teacher.setClassRoom(classrooms);
		teacher.setModeOfTeaching(ModeOfTeaching.OFFLINE);
		if (LOG.isInfoEnabled())
			LOG.info("TEACHER : {}", teacher);
		tdao.saveTeacher(teacher);
	}

}
