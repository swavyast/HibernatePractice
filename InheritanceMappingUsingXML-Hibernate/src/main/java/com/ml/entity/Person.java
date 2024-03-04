package com.ml.entity;

public class Person {

	private String id;
	private String name;
	private String fatherName;
	private String motherName;
	private String dob;
	private String age;
	private Gender gender;
	private Ethnicity ethnicity;

	public Person() {
		// default constructor
	}

	public Person(String name, String fatherName, String motherName, String dob, String age, Gender gender,
			Ethnicity ethnicity) {
		this.name = name;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.dob = dob;
		this.age = age;
		this.gender = gender;
		this.ethnicity = ethnicity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Ethnicity getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(Ethnicity ethnicity) {
		this.ethnicity = ethnicity;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", fatherName=" + fatherName + ", motherName=" + motherName
				+ ", dob=" + dob + ", age=" + age + ", gender=" + gender + ", ethnicity=" + ethnicity + "]";
	}

}
