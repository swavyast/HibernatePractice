package com.ml.client.read;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.dao.StudentDao;
import com.ml.dao.impl.StudentDaoImpl;
import com.ml.entity.Student;

public class FetchStudentList {

	private static final Logger LOG = LoggerFactory.getLogger(FetchStudentList.class);
	
	public static void main(String[] args) {

		StudentDao dao = new StudentDaoImpl();
		List<Student> list = dao.getAllStudents();
		list.stream().forEach(s->LOG.info(s.toString()));
	}

}
