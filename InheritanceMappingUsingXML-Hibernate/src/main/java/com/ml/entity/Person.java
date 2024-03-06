package com.ml.entity;

public class Person {

	private String pid;
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

	public Person(Person p) {
		this.name = p.name;
		this.fatherName = p.fatherName;
		this.motherName = p.motherName;
		this.dob = p.dob;
		this.age = p.age;
		this.gender = p.gender;
		this.ethnicity = p.ethnicity;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
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
		return "Person [pid=" + pid + ", name=" + name + ", fatherName=" + fatherName + ", motherName=" + motherName
				+ ", dob=" + dob + ", age=" + age + ", gender=" + gender + ", ethnicity=" + ethnicity + "]";
	}

}
