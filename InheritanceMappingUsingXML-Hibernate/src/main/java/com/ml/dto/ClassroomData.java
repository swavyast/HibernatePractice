package com.ml.dto;

public class ClassroomData {

	private String tid;
	private String className;
	private Integer classIndex;

	public ClassroomData() {
		// default constructor
	}

	public ClassroomData(String tid, String className, Integer classIndex) {
		super();
		this.tid = tid;
		this.className = className;
		this.classIndex = classIndex;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Integer getClassIndex() {
		return classIndex;
	}

	public void setClassIndex(Integer classIndex) {
		this.classIndex = classIndex;
	}

	@Override
	public String toString() {
		return "ClassroomData [tid=" + tid + ", className=" + className + ", classIndex=" + classIndex + "]";
	}

}
