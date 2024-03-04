package com.ml.entity;

public class Employee extends Person {

	private String employeeId;
	private Double salary;
	private Double bonus;
	private Integer annualLeaves;
	private Integer leaveWithoutPay;

	public Employee() {
	}

	public Employee(String name, String fatherName, String motherName, String dob, String age, Gender gender,
			Ethnicity ethnicity, String employeeId, Double salary, Double bonus, Integer annualLeaves, Integer leaveWithoutPay) {
		super(name, fatherName, motherName, dob, age, gender, ethnicity);
		this.employeeId = employeeId;
		this.salary = salary;
		this.bonus = bonus;
		this.annualLeaves = annualLeaves;
		this.leaveWithoutPay = leaveWithoutPay;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	public Integer getAnnualLeaves() {
		return annualLeaves;
	}

	public void setAnnualLeaves(Integer annualLeaves) {
		this.annualLeaves = annualLeaves;
	}

	public Integer getLeaveWithoutPay() {
		return leaveWithoutPay;
	}

	public void setLeaveWithoutPay(Integer leaveWithoutPay) {
		this.leaveWithoutPay = leaveWithoutPay;
	}

	@Override
	public String toString() {
		return super.toString() + " [employeeId=" + employeeId + ", salary=" + salary + ", bonus=" + bonus
				+ ", annualLeaves=" + annualLeaves + ", leaveWithoutPay=" + leaveWithoutPay + "]";
	}

}
