package com.ml.entity;

import java.util.Map;

public class RegularStudent extends Student {

	private String id;
	private String batchName;
	private Map<Subject, Teacher> subjectDetails;
	private ModeOfLearning modeOfLearning; // online/offline

	public RegularStudent() {
		// default constructor
	}

	public RegularStudent(String batchName, Map<Subject, Teacher> subjectDetails, ModeOfLearning modeOfLearning) {
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

	public Map<Subject, Teacher> getSubjectDetails() {
		return subjectDetails;
	}

	public void setSubjectDetails(Map<Subject, Teacher> subjectDetails) {
		this.subjectDetails = subjectDetails;
	}

	public ModeOfLearning getModeOfLearning() {
		return modeOfLearning;
	}

	public void setModeOfLearning(ModeOfLearning modeOfLearning) {
		this.modeOfLearning = modeOfLearning;
	}

	@Override
	public String toString() {
		return super.toString() + "[id=" + id + ", batchName=" + batchName + ", subjectDetails=" + subjectDetails
				+ ", modeOfLearning=" + modeOfLearning + "]";
	}
}
