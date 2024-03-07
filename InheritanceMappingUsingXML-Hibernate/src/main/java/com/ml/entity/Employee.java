package com.ml.entity;

public class Employee extends Person {

	private String eid;
	private Double salary;
	private Double bonus;
	private Integer annualLeaves;
	private Integer leaveWithoutPay;

	public Employee() {
	}

	public Employee(Double salary, Double bonus, Integer annualLeaves, Integer leaveWithoutPay) {
		this.salary = salary;
		this.bonus = bonus;
		this.annualLeaves = annualLeaves;
		this.leaveWithoutPay = leaveWithoutPay;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
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
		return "Employee [eid=" + eid + ", salary=" + salary + ", bonus=" + bonus + ", annualLeaves="
				+ annualLeaves + ", leaveWithoutPay=" + leaveWithoutPay + "]";
	}

}
