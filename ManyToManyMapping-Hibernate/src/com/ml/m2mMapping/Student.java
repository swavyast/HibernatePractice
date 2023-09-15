package com.ml.m2mMapping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SID")
	private long sid;
	@Column(name = "sName")
	private String name;
	@Column(name = "sEmail")
	private String email;
	@Column(name = "sPhone")
	private long phone;
	@Column(name = "sFee")
	private double fee;
	@OneToOne
	@JoinColumn(name = "myAddress", referencedColumnName = "AID")
	private Address address;
	@ManyToMany
	@JoinTable(name = "stuNcou", joinColumns = @JoinColumn(name="mySid", referencedColumnName = "sid"), 
	inverseJoinColumns = @JoinColumn(name="myCid", referencedColumnName = "cid"))
	private List<Course> courses;
	
	public Student() {System.out.println("Default constructor in Student class...");}

	public Student(String name, String email, long phone, double fee, Address address, List<Course> courses) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.fee = fee;
		this.address = address;
		this.courses = courses;
	}

	public long getSid() {
		return sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", fee=" + fee
				+ ", address=" + address + ", courses=" + courses + "]";
	}
}
