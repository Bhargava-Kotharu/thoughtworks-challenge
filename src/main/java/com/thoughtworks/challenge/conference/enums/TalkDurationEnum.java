package com.thoughtworks.challenge.conference.enums;

public enum TalkDurationEnum {
    
    MINUTE(1, "min"), LIGHTENING(5, "lightning");

    private int factor;
    private String stringRepresentation;

    private TalkDurationEnum(int factor, String stringRepresentation) {
	this.factor = factor;
	this.stringRepresentation = stringRepresentation;
    }

    public int inMinutes(int duration) {
	return factor * duration;
    }

    @Override
    public String toString() {
	return stringRepresentation;
    }
}
