package com.thoughtworks.challenge.conference.dto;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.challenge.conference.enums.SessionTypeEnum;

public class Session {

    private List<Talk> talks;
    private SessionTypeEnum sessionType;
    private int sessionLength;

    public Session(SessionTypeEnum sessionType, int sessionLength) {
	super();
	this.sessionType = sessionType;
	this.sessionLength = sessionLength;
	talks = new ArrayList<Talk>();
    }

    public List<Talk> getTalks() {
	return talks;
    }

    public SessionTypeEnum getSessionType() {
	return sessionType;
    }

    public int getSessionLength() {
	return sessionLength;
    }

    public void setTalks(List<Talk> talks) {
	this.talks = talks;
    }

    public void setSessionType(SessionTypeEnum sessionType) {
	this.sessionType = sessionType;
    }

    public void setSessionLength(int sessionLength) {
	this.sessionLength = sessionLength;
    }

    @Override
    public String toString() {
	return "Session [talks=" + talks + ", sessionType=" + sessionType + ", sessionLength=" + sessionLength + "]";
    }

}
