package com.thoughtworks.challenge.parser;

import java.util.regex.Matcher;

import com.thoughtworks.challenge.conference.dto.Talk;
import com.thoughtworks.challenge.conference.enums.TalkDurationEnum;
import com.thoughtworks.challenge.constants.ApplicationConstants;

public class ConferenceManagementLineParser implements LineParser<Talk> {

    public Talk parseLine(String line) {

	if (line == null || line.isEmpty()) {
	    return null;
	}

	Matcher matcher = ApplicationConstants.CONFERENCE_MGMT_PATTERN.matcher(line);
	if (!matcher.matches()) {
	    return null;
	}

	TalkDurationEnum talkDurationEnum = TalkDurationEnum.MINUTE;
	if (line.toLowerCase().contains(ApplicationConstants.LIGHTNING)) {
	    talkDurationEnum = TalkDurationEnum.LIGHTENING;
	}

	String talkDescription = matcher.group(1);
	String talkDurationStr = matcher.group(2);

	int talkDuration = Integer.parseInt(talkDurationStr != null ? talkDurationStr : ApplicationConstants.DEFAULT_TALK_DURATION);

	return new Talk(talkDescription, talkDuration, talkDurationEnum);

    }

}
