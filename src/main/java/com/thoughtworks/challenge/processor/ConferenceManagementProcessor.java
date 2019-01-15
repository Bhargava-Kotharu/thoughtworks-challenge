package com.thoughtworks.challenge.processor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.challenge.conference.dto.ConferenceSchedule;
import com.thoughtworks.challenge.conference.dto.Session;
import com.thoughtworks.challenge.conference.dto.Talk;
import com.thoughtworks.challenge.conference.dto.Track;
import com.thoughtworks.challenge.conference.enums.SessionTypeEnum;
import com.thoughtworks.challenge.conference.enums.TalkDurationEnum;
import com.thoughtworks.challenge.conference.helper.ConferenceManagementHelper;
import com.thoughtworks.challenge.constants.ApplicationConstants;
import com.thoughtworks.challenge.parser.LineParser;
import com.thoughtworks.challenge.parser.ParserFactory;
import com.thoughtworks.challenge.utils.FileUtils;

public class ConferenceManagementProcessor extends Processor<ConferenceSchedule> {

    @Override
    public BufferedReader read(File file) throws FileNotFoundException {
	return FileUtils.getBufferedReaderFromFile(file);
    }

    @Override
    public ConferenceSchedule parse(BufferedReader reader) {

	@SuppressWarnings("rawtypes")
	LineParser parser = ParserFactory.getParser(ApplicationConstants.CONFERENCE_MGMT);
	List<Talk> talkList = new ArrayList<>();
	reader.lines().forEach(line -> {
	    Talk talk = (Talk) parser.parseLine(line);
	    talkList.add(talk);
	});
	return initializeSchedule(talkList);
    }

    @Override
    public ConferenceSchedule process(ConferenceSchedule schedule) {

	List<Talk> talks = schedule.getUnscheduledTalks();
	Track track = new Track();
	Session morningSession = new Session(SessionTypeEnum.MORNING_SESSION,
		ApplicationConstants.MORNING_SESSION_DURATION);
	Session lunchSession = new Session(SessionTypeEnum.LUNCH_SESSION, ApplicationConstants.LUNCH_DURATION);
	Session afternoonSession = new Session(SessionTypeEnum.EVENING_SESSION,
		ApplicationConstants.AFTERNOON_SESSION_DURATION);
	Session eveningSession = new Session(SessionTypeEnum.EVENING_SESSION,
		ApplicationConstants.EVENING_SESSION_DURATION);

	ConferenceManagementHelper.addTalksToSession(morningSession, talks);
	ConferenceManagementHelper.addTalksToSession(afternoonSession, talks);
	ConferenceManagementHelper.addTalksToSession(eveningSession, talks);

	lunchSession.getTalks().add(
		new Talk(ApplicationConstants.LUNCH, ApplicationConstants.LUNCH_DURATION, TalkDurationEnum.MINUTE));

	track.addSessionToTrack(morningSession);
	track.addSessionToTrack(lunchSession);
	track.addSessionToTrack(afternoonSession);
	track.addSessionToTrack(eveningSession);
	schedule.addTrackToConference(track);
	if (talks.size() != 0)
	    process(schedule);
	return schedule;
    }

    @Override
    public void write(ConferenceSchedule schedule) {

	StringBuilder output = new StringBuilder();

	schedule.getTracks().forEach(track -> {
	    track.getSessions().forEach(session -> {
		System.out.println(session);
		session.getTalks().forEach(System.out::println);
	    });
	});

	System.out.println(output.toString());
    }

    private ConferenceSchedule initializeSchedule(List<Talk> talks) {
	ConferenceSchedule schedule = new ConferenceSchedule();
	schedule.setUnscheduledTalks(talks);
	return schedule;

    }

}
