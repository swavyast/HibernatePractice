package com.ml.client;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.dao.PersonDao;
import com.ml.dao.impl.PersonDaoImpl;
import com.ml.entity.Person;

public class FetchPerson {
	
	private static final Logger LOG = LoggerFactory.getLogger(FetchPerson.class);

	public static void main(String[] args) {

		PersonDao pdao = new PersonDaoImpl();
		List<Person> persons = pdao.getAllPeople();
		for(Person p:persons)
			System.out.println(p);
		persons.stream().forEach(p->LOG.info(p.toString()));
	}

}
