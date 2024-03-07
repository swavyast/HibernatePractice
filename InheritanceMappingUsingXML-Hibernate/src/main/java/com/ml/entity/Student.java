package com.ml.entity;

public class Student extends Person {

	private String studentId;
	private String email;
	private String enrollmentId;
	private String batch;
	private String displayPicture;
	private String marksheet;

	public Student() {
		// default constructor
	}

	public Student(String name, String fatherName, String motherName, String dob, String age, Gender gender,
			Ethnicity ethnicity) {
		super(name, fatherName, motherName, dob, age, gender, ethnicity);

	}

	public Student(String email, String enrollmentId, String batch, String displayPicture, String marksheet) {
		super();
		this.email = email;
		this.enrollmentId = enrollmentId;
		this.batch = batch;
		this.displayPicture = displayPicture;
		this.marksheet = marksheet;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String id) {
		this.studentId = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(String enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getDisplayPicture() {
		return displayPicture;
	}

	public void setDisplayPicture(String displayPicture) {
		this.displayPicture = displayPicture;
	}

	public String getMarksheet() {
		return marksheet;
	}

	public void setMarksheet(String marksheet) {
		this.marksheet = marksheet;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", email=" + email + ", enrollmentId=" + enrollmentId
				+ ", batch=" + batch + ", displayPicture=" + displayPicture + ", marksheet=" + marksheet + "]";
	}

}
