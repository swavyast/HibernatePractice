package com.ml.dto;

public class FacilityData {

	private String sid;
	private String facility;

	public FacilityData() {
		// default constructor
	}

	public FacilityData(String sid, String facility) {
		super();
		this.sid = sid;
		this.facility = facility;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

@Override
	public String toString() {
		return "FacilityData [sid=" + sid + ", facility=" + facility + "]";
	}
}
