package com.ml.m2mMapping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CID")
	private long cid;
	@Column(name = "cName")
	private String courseName;
	@Column(name = "Tutor")
	private String tutor;
	@Column(name = "Duration")
	private String duration;
	@Column(name = "Timing")
	private String batchTiming;
	@ManyToMany(mappedBy = "courses")
	private List<Student> student;
	
	public Course() {System.out.println("Default constructor in Course class...");}

	public Course(String courseName, String tutor, String duration, String batchTiming, List<Student> student) {
		super();
		this.courseName = courseName;
		this.tutor = tutor;
		this.duration = duration;
		this.batchTiming = batchTiming;
		this.student = student;
	}

	public long getCid() {
		return cid;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getBatchTiming() {
		return batchTiming;
	}

	public void setBatchTiming(String batchTiming) {
		this.batchTiming = batchTiming;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", courseName=" + courseName + ", tutor=" + tutor + ", duration=" + duration
				+ ", batchTiming=" + batchTiming + ", student=" + student + "]";
	}
}
