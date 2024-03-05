package com.ml.entity;

import java.util.Arrays;
import java.util.Set;

public class Staff extends Employee {

	private String id;
	private String department;
	private String manager;
	private String[] teamMembers;
	private String position;
	private Set<String> canAccess; // facilities

	public Staff() {
		// default constructor
	}

	public Staff(Person p, Employee e, Staff s) {
		super(p, e);
		this.department = s.department;
		this.manager = s.manager;
		this.teamMembers = s.teamMembers;
		this.position = s.position;
		this.canAccess = s.canAccess;
	}

	public Staff(Person p, Employee emp, String department, String manager, String[] teamMembers, String position,
			Set<String> canAccess) {
		super(p, emp);
		this.department = department;
		this.manager = manager;
		this.teamMembers = teamMembers;
		this.position = position;
		this.canAccess = canAccess;
	}

	public Staff(String department, String manager, String[] teamMembers, String position, Set<String> canAccess) {
		super();
		this.department = department;
		this.manager = manager;
		this.teamMembers = teamMembers;
		this.position = position;
		this.canAccess = canAccess;
	}

	public Staff(String name, String fatherName, String motherName, String dob, String age, Gender gender,
			Ethnicity ethnicity, Double salary, Double bonus, Integer annualLeaves, Integer leaveWithoutPay,
			String department, String manager, String[] teamMembers, String position, Set<String> canAccess) {
		super(name, fatherName, motherName, dob, age, gender, ethnicity, salary, bonus, annualLeaves, leaveWithoutPay);
		this.department = department;
		this.manager = manager;
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
		return manager;
	}

	public void setReportsTo(String reportsTo) {
		this.manager = reportsTo;
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

	public Set<String> getCanAccess() {
		return canAccess;
	}

	public void setCanAccess(Set<String> canAccess) {
		this.canAccess = canAccess;
	}

	@Override
	public String toString() {
		return super.toString() + " [id=" + id + ", department=" + department + ", manager=" + manager
				+ ", teamMembers=" + Arrays.toString(teamMembers) + ", position=" + position + ", canAccess="
				+ canAccess + "]";
	}

}
