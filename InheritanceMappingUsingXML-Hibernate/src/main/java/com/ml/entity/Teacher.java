package com.ml.entity;

import java.util.Arrays;
import java.util.List;

public class Teacher extends Staff {

	private String id;
	private List<Subject> specialities;
	private String[] classRoom;
	private Enum modeOfTeaching;

	public Teacher() {
		// default constructor
	}

	public Teacher(List<Subject> specialities, String[] classRoom, Enum modeOfTeaching) {
		super();
		this.specialities = specialities;
		this.classRoom = classRoom;
		this.modeOfTeaching = modeOfTeaching;
	}

	public String getId() {
		return id;
	}

	public List<Subject> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(List<Subject> specialities) {
		this.specialities = specialities;
	}

	public String[] getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(String[] classRoom) {
		this.classRoom = classRoom;
	}

	public Enum getModeOfTeaching() {
		return modeOfTeaching;
	}

	public void setModeOfTeaching(Enum modeOfTeaching) {
		this.modeOfTeaching = modeOfTeaching;
	}

	@Override
	public String toString() {
		return super.toString() + "[specialities=" + specialities + ", classRoom=" + Arrays.toString(classRoom)
				+ ", modeOfTeaching=" + modeOfTeaching + "]";
	}

}
