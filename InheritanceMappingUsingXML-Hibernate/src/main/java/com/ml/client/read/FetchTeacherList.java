package com.ml.client.read;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.dao.TeacherDao;
import com.ml.dao.impl.TeacherDaoImpl;
import com.ml.entity.Teacher;

public class FetchTeacherList {
	
	private static final Logger LOG = LoggerFactory.getLogger(FetchTeacherList.class);

	public static void main(String[] args) {
		
		TeacherDao dao = new TeacherDaoImpl();
		List<Teacher> list = dao.getAllTeachers();
		list.stream().forEach(p -> LOG.info(p.toString()));
	}

}
