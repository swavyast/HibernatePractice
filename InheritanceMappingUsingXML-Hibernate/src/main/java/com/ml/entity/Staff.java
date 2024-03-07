package com.ml.entity;

import java.util.List;
import java.util.Set;

public class Staff extends Employee {

	private String sid;
	private String department;
	private String manager;
	private List<String> teamMembers;
	private String position;
	private Set<String> canAccess; // facilities

	public Staff() {
		// default constructor
	}

	public Staff(String department, String manager, List<String> teamMembers, String position, Set<String> canAccess) {
		super();
		this.department = department;
		this.manager = manager;
		this.teamMembers = teamMembers;
		this.position = position;
		this.canAccess = canAccess;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public List<String> getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(List<String> teamMembers) {
		this.teamMembers = teamMembers;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Set<String> getCanAccess() {
		return canAccess;
	}

	public void setCanAccess(Set<String> canAccess) {
		this.canAccess = canAccess;
	}

	@Override
	public String toString() {
		return "Staff [sid=" + sid + ", department=" + department + ", manager=" + manager + ", teamMembers="
				+ teamMembers + ", position=" + position + ", canAccess=" + canAccess + "]";
	}
}
