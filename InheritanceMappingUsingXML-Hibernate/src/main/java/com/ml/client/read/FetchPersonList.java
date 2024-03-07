package com.ml.client.read;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.dao.PersonDao;
import com.ml.dao.impl.PersonDaoImpl;
import com.ml.entity.Person;

public class FetchPersonList {
	
	private static final Logger LOG = LoggerFactory.getLogger(FetchPersonList.class);

	public static void main(String[] args) {

		PersonDao dao = new PersonDaoImpl();
		List<Person> list = dao.getAllPeople();
		list.stream().forEach(p -> LOG.info(p.toString()));
	}

}
