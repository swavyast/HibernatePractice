package com.ml.entity;

public class Student {
	
	private String id;
	private String name;
	private String email;
	private String enrollmentId;
	private String batch;
	private String displayPicture;
	private String marksheet;
	
	public Student() {}

	public Student(String name, String email, String enrollmentId, String batch, String displayPicture,
			String marksheet) {
		super();
		this.name = name;
		this.email = email;
		this.enrollmentId = enrollmentId;
		this.batch = batch;
		this.displayPicture = displayPicture;
		this.marksheet = marksheet;
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
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", enrollmentId=" + enrollmentId
				+ ", batch=" + batch + ", displayPicture=" + displayPicture + ", marksheet=" + marksheet + "]";
	}

}
