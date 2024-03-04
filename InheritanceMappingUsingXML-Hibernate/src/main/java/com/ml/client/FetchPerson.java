package com.ml.client;

import java.util.List;

import com.ml.dao.PersonDao;
import com.ml.dao.impl.PersonDaoImpl;
import com.ml.entity.Person;

public class FetchPerson {

	public static void main(String[] args) {
		
		PersonDao pdao = new PersonDaoImpl();
		List<Person> persons = pdao.getAllPerson();
		persons.stream().forEach(p->System.out.println(p));
	}

}
