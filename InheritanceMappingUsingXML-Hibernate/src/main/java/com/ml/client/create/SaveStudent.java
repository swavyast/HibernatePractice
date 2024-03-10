package com.ml.client.create;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.dao.StudentDao;
import com.ml.dao.impl.StudentDaoImpl;
import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;
import com.ml.entity.Student;

public class SaveStudent {

	private static final Logger LOG = LoggerFactory.getLogger(SaveStudent.class);

	public static void main(String[] args) {

		StudentDao dao = new StudentDaoImpl();
		Student student = new Student("ayushi@email.com", "ENID-204", "B-5", "avatar", "reportCard");
		student.setName("Ayushi Chandel");
		student.setAge("31");
		student.setDob("02/05/1993");
		student.setEthnicity(Ethnicity.AMERICAN);
		student.setGender(Gender.FEMALE);
		student.setFatherName("Sanjeev Chandel");
		student.setMotherName("Maya Chandel");
		LOG.info("saving student instance");
		dao.saveStudent(student);
	}

}
