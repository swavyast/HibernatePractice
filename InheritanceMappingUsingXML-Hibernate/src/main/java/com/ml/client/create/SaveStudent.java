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
		Student student = new Student("email@email.com", "ENID-203", "B-6", "avatar", "reportCard");
		student.setName("Animesh Prajapati");
		student.setAge("33");
		student.setDob("02/05/1990");
		student.setEthnicity(Ethnicity.HISPANIC);
		student.setGender(Gender.MALE);
		student.setFatherName("Not Provided");
		student.setMotherName("Not Provided");
		dao.saveStudent(student);
	}

}
