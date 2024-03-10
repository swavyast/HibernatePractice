package com.ml.client.create;

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
		teacher.setName("Anita Bhardwaj");
		teacher.setFatherName("Anil Bhardwaj");
		teacher.setMotherName("Rekha Devi");
		teacher.setGender(Gender.FEMALE);
		teacher.setAge("18");
		teacher.setEthnicity(Ethnicity.CAUCASIAN);
		teacher.setDob("01-July-2005");
		teacher.setSalary(10000.00);
		teacher.setBonus(500.00);
		teacher.setAnnualLeaves(2);
		teacher.setLeaveWithoutPay(0);
		teacher.setDepartment("Computer Organisation");
		teacher.setPosition("Asst. Professor");
		teacher.setManager("Chandrashekhar Rai");
		teacher.setTeamMembers(Arrays.asList("Rohit Singh", "Romail Rai"));
		Set<String> set = new HashSet<>();
		set.add("ClassRoom");
		set.add("Admin Cell");
		set.add("Auditorium");
		teacher.setCanAccess(set);
		List<Subject> specs = Arrays.asList(Subject.COMPUTER);
		teacher.setSpecialities(specs);
		List<String> classrooms = Arrays.asList("CR-A103");
		teacher.setClassRoom(classrooms);
		teacher.setModeOfTeaching(ModeOfTeaching.OFFLINE);
		if (LOG.isInfoEnabled())
			LOG.info("{}", teacher); // using formatter {}.
		tdao.saveTeacher(teacher);
	}

}
