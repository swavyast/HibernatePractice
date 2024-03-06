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

	public Employee(String name, String fatherName, String motherName, String dob, String age, Gender gender,
			Ethnicity ethnicity, Double salary, Double bonus, Integer annualLeaves, Integer leaveWithoutPay) {
		super(name, fatherName, motherName, dob, age, gender, ethnicity);
		this.salary = salary;
		this.bonus = bonus;
		this.annualLeaves = annualLeaves;
		this.leaveWithoutPay = leaveWithoutPay;
	}

	public Employee(Person p, Double salary, Double bonus, Integer annualLeaves, Integer leaveWithoutPay) {
		super(p);
		this.salary = salary;
		this.bonus = bonus;
		this.annualLeaves = annualLeaves;
		this.leaveWithoutPay = leaveWithoutPay;
	}

	public Employee(Person p, Employee emp) {
		super(p);
		this.salary = emp.salary;
		this.bonus = emp.bonus;
		this.annualLeaves = emp.annualLeaves;
		this.leaveWithoutPay = emp.leaveWithoutPay;
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
		return super.toString()+"Employee [eid=" + eid + ", salary=" + salary + ", bonus=" + bonus + ", annualLeaves=" + annualLeaves
				+ ", leaveWithoutPay=" + leaveWithoutPay + "]";
	}

}
