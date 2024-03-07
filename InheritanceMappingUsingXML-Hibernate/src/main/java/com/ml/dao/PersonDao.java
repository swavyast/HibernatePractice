package com.ml.dao;

import java.util.List;

import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;
import com.ml.entity.Person;

public interface PersonDao {

	public void savePerson(Person person);

	public Person getPersonByPersonId(String pid);

	public Person getPersonByName(String name);

	public List<Person> getPeopleByFatherName(String fatherName);

	public List<Person> getPeopleByMotherName(String motherName);

	public List<Person> getPeopleByDateOfBirth(String dob);

	public List<Person> getPeopleByAge(String age);

	public List<Person> getPeopleByGender(Gender gender);

	public List<Person> getPeopleByEthnicity(Ethnicity ethnicity);

	public List<Person> getPeopleByGender(String gender);

	public List<Person> getPeopleByEthnicity(String ethnicity);

	public List<Person> getAllPeople();
}
