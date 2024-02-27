package com.ml.entity;

import java.util.Arrays;
import java.util.Set;

public class Staff extends Employee {
	
	private String id;
	private String department;
	private String reportsTo;
	private String [] teamMembers;
	private String position;
	private Set canAccess;	//facilities
	
	public Staff() {
		//default constructor
	}

	public Staff(String id, String department, String reportsTo, String[] teamMembers, String position, Set canAccess) {
		super();
		this.id = id;
		this.department = department;
		this.reportsTo = reportsTo;
		this.teamMembers = teamMembers;
		this.position = position;
		this.canAccess = canAccess;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(String reportsTo) {
		this.reportsTo = reportsTo;
	}

	public String[] getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(String[] teamMembers) {
		this.teamMembers = teamMembers;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Set getCanAccess() {
		return canAccess;
	}

	public void setCanAccess(Set canAccess) {
		this.canAccess = canAccess;
	}

	@Override
	public String toString() {
		return super.toString()+" [id=" + id + ", department=" + department + ", reportsTo=" + reportsTo + ", teamMembers="
				+ Arrays.toString(teamMembers) + ", position=" + position + ", canAccess=" + canAccess + "]";
	}
	
}
