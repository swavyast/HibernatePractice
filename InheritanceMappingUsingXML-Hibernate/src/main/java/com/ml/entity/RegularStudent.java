package com.ml.entity;

import java.util.Map;

public class RegularStudent extends Student {

	private String id;
	private String batchName;
	private Map<String, Teacher> subjectDetails;
	private Enum modeOfLearning; // online/offline

	public RegularStudent() {
		// default constructor
	}

	public RegularStudent(String batchName, Map<String, Teacher> subjectDetails, Enum modeOfLearning) {
		super();
		this.batchName = batchName;
		this.subjectDetails = subjectDetails;
		this.modeOfLearning = modeOfLearning;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public Map<String, Teacher> getSubjectDetails() {
		return subjectDetails;
	}

	public void setSubjectDetails(Map<String, Teacher> subjectDetails) {
		this.subjectDetails = subjectDetails;
	}

	public Enum getModeOfLearning() {
		return modeOfLearning;
	}

	public void setModeOfLearning(Enum modeOfLearning) {
		this.modeOfLearning = modeOfLearning;
	}

	@Override
	public String toString() {
		return super.toString() + "[id=" + id + ", batchName=" + batchName + ", subjectDetails=" + subjectDetails
				+ ", modeOfLearning=" + modeOfLearning + "]";
	}
}
