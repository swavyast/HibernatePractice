package com.ml.dto;

public class TeamMemberData {

	private String sid;
	private String member;
	private Integer memberIndex;

	public TeamMemberData() {
		// default constructor
	}

	public TeamMemberData(String sid, String member, Integer memberIndex) {
		super();
		this.sid = sid;
		this.member = member;
		this.memberIndex = memberIndex;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}

	public Integer getMemberIndex() {
		return memberIndex;
	}

	public void setMemberIndex(Integer memberIndex) {
		this.memberIndex = memberIndex;
	}

	@Override
	public String toString() {
		return "TeamMemberData [sid=" + sid + ", member=" + member + ", memberIndex=" + memberIndex + "]";
	}

}
