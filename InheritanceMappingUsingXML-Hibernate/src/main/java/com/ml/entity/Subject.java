package com.ml.entity;

public enum Subject {

	MATHEMATICS, SCIENCE, HISTORY, GEOGRAPHY, POLITY, ECONOMICS, MECHANICS, STATISTICS, SANSKRIT, HINDI, ENGLISH,
	COMPUTER, NETWORK, OPERATINGSYSTEM,;

	public static int getOrdinal(Subject subject) {
		return subject.ordinal();
	}
}
