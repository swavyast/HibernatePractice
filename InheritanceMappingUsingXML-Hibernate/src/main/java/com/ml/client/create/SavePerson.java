package com.ml.client.create;

import com.ml.dao.impl.PersonDaoImpl;
import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;
import com.ml.entity.Person;

public class SavePerson {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("Hemant Rai");
		person1.setFatherName("Dinesh Kumar Rai");
		person1.setMotherName("Nilam Rai");
		person1.setDob("02/08/1992");
		person1.setAge("30");
		person1.setGender(Gender.MALE);
		person1.setEthnicity(Ethnicity.AFRICAN);
		new PersonDaoImpl().savePerson(person1);
	}

}
