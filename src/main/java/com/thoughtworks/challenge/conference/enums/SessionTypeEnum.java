package com.thoughtworks.challenge.conference.enums;

public enum SessionTypeEnum {

    MORNING_SESSION("morning"), LUNCH_SESSION("noon"), AFTER_NOON_SESSION("afternoon"), EVENING_SESSION("evening");

    private String sessionType;

    private SessionTypeEnum(String sessionType) {
	this.sessionType = sessionType;
    }

    @Override
    public String toString() {
	return sessionType;
    }
}
