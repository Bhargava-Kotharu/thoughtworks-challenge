package com.thoughtworks.challenge.conference.dto;

import com.thoughtworks.challenge.conference.enums.TalkDurationEnum;

public class Talk   {

    private String talkDescription;
    private int talkLength;
    private TalkDurationEnum talkDuration;

    public Talk(String talkDescription, int talkLength, TalkDurationEnum talkDuration) {
	super();
	this.talkDescription = talkDescription;
	this.talkLength = talkLength;
	this.talkDuration = talkDuration;
    }

    public String getTalkDescription() {
	return talkDescription;
    }

    public int getTalkLength() {
	return talkLength;
    }

    public TalkDurationEnum getTalkDuration() {
	return talkDuration;
    }

    public void setTalkDescription(String talkDescription) {
	this.talkDescription = talkDescription;
    }

    public void setTalkLength(int talkLength) {
	this.talkLength = talkLength;
    }

    public void setTalkDuration(TalkDurationEnum talkDuration) {
	this.talkDuration = talkDuration;
    }

    @Override
    public String toString() {
	return "Talk [talkDescription=" + talkDescription + ", talkLength=" + talkLength + ", talkDuration="
		+ talkDuration + "]";
    }

}
