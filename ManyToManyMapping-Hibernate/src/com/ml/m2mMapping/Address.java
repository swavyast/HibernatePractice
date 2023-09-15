package com.ml.m2mMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "stuAddress")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AID")
	private long aid;
	@Column(name = "HN")
	private String houseNumber;
	@Column(name = "SEC")
	private String sector;
	@Column(name = "CITY")
	private String city;
	@Column(name = "DISTT")
	private String district;
	@Column(name = "STATE")
	private String state;
	@Column(name = "COUNTRY")
	private String country;
	@Column(name = "PIN")
	private int pincode;
	@OneToOne(mappedBy = "address")
	private Student student;
	
	public Address() {System.out.println("Default constructor in Address class...");}
	
	public Address(String houseNumber, String sector, String city, String district, String state, String country,
			int pincode, Student student) {
		super();
		this.houseNumber = houseNumber;
		this.sector = sector;
		this.city = city;
		this.district = district;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.student = student;
	}
	public long getAid() {
		return aid;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", houseNumber=" + houseNumber + ", sector=" + sector + ", city=" + city
				+ ", district=" + district + ", state=" + state + ", country=" + country + ", pincode=" + pincode
				+ ", student=" + student + "]";
	}
}
