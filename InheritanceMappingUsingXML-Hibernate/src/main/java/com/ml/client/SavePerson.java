package com.ml.client;

import com.ml.dao.PersonDao;
import com.ml.dao.impl.PersonDaoImpl;
import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;
import com.ml.entity.Person;

public class SavePerson {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("Himanshu Rai");
		person1.setFatherName("Dinesh Kumar Rai");
		person1.setMotherName("Nilam Rai");
		person1.setDob("01/07/1994");
		person1.setAge("30");
		person1.setGender(Gender.MALE);
		person1.setEthnicity(Ethnicity.ASIAN);
		PersonDao pdao = new PersonDaoImpl();
		pdao.savePerson(person1);
	}

}
