package com.thoughtworks.challenge.conference.dto;

import java.util.ArrayList;
import java.util.List;

public class ConferenceSchedule {

    private List<Track> tracks;

    List<Talk> unscheduledTalks;

    public ConferenceSchedule() {
	this.unscheduledTalks = new ArrayList<>();
    }

    public List<Track> getTracks() {
	return tracks;
    }

    public List<Talk> getUnscheduledTalks() {
	return unscheduledTalks;
    }

    public void setTracks(List<Track> tracks) {
	this.tracks = tracks;
    }

    public void setUnscheduledTalks(List<Talk> unscheduledTalks) {
	this.unscheduledTalks = unscheduledTalks;
    }

    public void addTrackToConference(Track track) {
	if (tracks == null) {
	    tracks = new ArrayList<Track>();
	}
	tracks.add(track);
    }

    @Override
    public String toString() {
	return "ConferenceSchedule [tracks=" + tracks + "]";
    }

}
