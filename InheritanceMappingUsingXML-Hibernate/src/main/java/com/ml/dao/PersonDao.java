package com.ml.dao;

import java.util.List;

import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;
import com.ml.entity.Person;

public interface PersonDao {

	public void savePerson(Person person);
	public Person getPersonById(String id);
	public Person getPersonByName(String name);
	public List<Person> getPersonByFatherName(String fatherName);
	public List<Person> getPersonByMoherName(String MotherName);
	public List<Person> getPersonByDateOfBirth(String dob);
	public List<Person> getPersonByAge(String age);
	public List<Person> getPersonByGender(Gender gender);
	public List<Person> getPersonByEthnicity(Ethnicity ethnicity);
	public List<Person> getPersonByGender(String gender);
	public List<Person> getPersonByEthnicity(String ethnicity);
	public List<Person> getAllPerson();
}
