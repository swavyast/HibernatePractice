package com.ml.entity;

public enum Subject {

	MATHEMATICS, SCIENCE, HISTORY, GEOGRAPHY, POLITY, ECONOMICS, MECHANICS, STATISTICS, SANSKRIT, HINDI, ENGLISH;

	public static int getOrdinal(Subject subject) {
		return subject.ordinal();
	}
}
