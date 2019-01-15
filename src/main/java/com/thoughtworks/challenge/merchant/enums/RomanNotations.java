package com.thoughtworks.challenge.merchant.enums;

public enum RomanNotations {

    I(1, "I"), X(10, "X");

    private int numericalValue;
    private String romanRepresentation;

    private RomanNotations(int numericalValue, String romanRepresentation) {
	this.numericalValue = numericalValue;
	this.romanRepresentation = romanRepresentation;
    }

    public int getNumericValue() {
	return numericalValue;
    }

    public String getRomanRepresentation() {
	return romanRepresentation;
    }
}
