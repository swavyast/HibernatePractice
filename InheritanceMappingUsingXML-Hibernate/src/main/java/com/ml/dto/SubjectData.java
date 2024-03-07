package com.ml.dto;

import com.ml.entity.Subject;

public class SubjectData {

	private String tid;
	private Integer subject;
	private Integer spSort;
	private Subject subjectEnum;

	public SubjectData() {
		// default constructor
	}

	public SubjectData(String tid, Integer subject, Integer spSort, Subject subjectEnum) {
		super();
		this.tid = tid;
		this.subject = subject;
		this.spSort = spSort;
		this.subjectEnum = subjectEnum;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public Integer getSubject() {
		return subject;
	}

	public void setSubject(Integer subject) {
		this.subject = subject;
		this.subjectEnum = Subject.values()[subject];
	}

	public Integer getSpSort() {
		return spSort;
	}

	public void setSpSort(Integer spSort) {
		this.spSort = spSort;
	}

	public Subject getSubjectEnum() {
		return subjectEnum;
	}

	public void setSubjectEnum(Subject subjectEnum) {
		this.subjectEnum = subjectEnum;
		this.subject = subjectEnum.ordinal();
	}

	@Override
	public String toString() {
		return "SubjectData [Ordinal=" + subject + ", Name=" + subjectEnum + "]";
	}

}
