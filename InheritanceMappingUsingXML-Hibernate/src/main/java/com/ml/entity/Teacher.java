package com.ml.entity;

import java.util.List;
import java.util.Set;

public class Teacher extends Staff {

	private String tid;
	private List<Subject> specialities;
	private List<String> classRoom;
	private ModeOfTeaching modeOfTeaching;

	public Teacher() {
		// default constructor
	}

	public Teacher(Person p, Employee e, Staff s, Teacher t) {
		super(p, e, s);
		this.specialities = t.specialities;
		this.classRoom = t.classRoom;
		this.modeOfTeaching = t.modeOfTeaching;
	}

	public Teacher(Person p, Employee e, Staff s, List<Subject> specialities, List<String> classRoom,
			ModeOfTeaching modeOfTeaching) {
		super(p, e, s);
		this.specialities = specialities;
		this.classRoom = classRoom;
		this.modeOfTeaching = modeOfTeaching;
	}

	public Teacher(List<Subject> specialities, List<String> classRoom, ModeOfTeaching modeOfTeaching) {
		super();
		this.specialities = specialities;
		this.classRoom = classRoom;
		this.modeOfTeaching = modeOfTeaching;
	}

	public Teacher(String name, String fatherName, String motherName, String dob, String age, Gender gender,
			Ethnicity ethnicity, Double salary, Double bonus, Integer annualLeaves, Integer leaveWithoutPay,
			String department, String manager, List<String> teamMembers, String position, Set<String> canAccess,
			List<Subject> specialities, List<String> classRoom, ModeOfTeaching modeOfTeaching) {

		super(name, fatherName, motherName, dob, age, gender, ethnicity, salary, bonus, annualLeaves, leaveWithoutPay,
				department, manager, teamMembers, position, canAccess);
		this.specialities = specialities;
		this.classRoom = classRoom;
		this.modeOfTeaching = modeOfTeaching;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public List<Subject> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(List<Subject> specialities) {
		this.specialities = specialities;
	}

	public List<String> getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(List<String> classRoom) {
		this.classRoom = classRoom;
	}

	public ModeOfTeaching getModeOfTeaching() {
		return modeOfTeaching;
	}

	public void setModeOfTeaching(ModeOfTeaching modeOfTeaching) {
		this.modeOfTeaching = modeOfTeaching;
	}

	@Override
	public String toString() {
		return super.toString()+"Teacher [tid=" + tid + ", specialities=" + specialities + ", classRoom=" + classRoom
				+ ", modeOfTeaching=" + modeOfTeaching + "]";
	}

}
