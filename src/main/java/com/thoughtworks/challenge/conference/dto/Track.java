package com.thoughtworks.challenge.conference.dto;

import java.util.ArrayList;
import java.util.List;

public class Track {

    private List<Session> sessions;
    private boolean isTrackFilled;

    public Track() {
	this.isTrackFilled = false;
    }

    public List<Session> getSessions() {
	return sessions;
    }

    public boolean isTrackFilled() {
	return isTrackFilled;
    }

    public void setSessions(List<Session> sessions) {
	this.sessions = sessions;
    }

    public void setTrackFilled(boolean isTrackFilled) {
	this.isTrackFilled = isTrackFilled;
    }

    public void addSessionToTrack(Session session) {
	if (sessions == null)
	    sessions = new ArrayList<Session>();
	sessions.add(session);
    }

    @Override
    public String toString() {
	return "Track [sessions=" + sessions + ", isTrackFilled=" + isTrackFilled + "]";
    }

}
