package com.thoughtworks.challenge.conference.helper;

import java.util.Iterator;
import java.util.List;

import com.thoughtworks.challenge.conference.dto.Session;
import com.thoughtworks.challenge.conference.dto.Talk;

public class ConferenceManagementHelper {

    private static boolean canSessionAccomodateTalk(Session session, Talk talk) {
	int totalAccomodatedTime = session.getTalks() == null ? 0
		: session.getTalks().stream().mapToInt(p -> p.getTalkLength()).sum();
	return session.getSessionLength() - totalAccomodatedTime >= talk.getTalkLength();
    }

    private static void addTalkToSession(Session session, Talk talk) {
	session.getTalks().add(talk);
    }

    public static void addTalksToSession(Session session, List<Talk> talks) {

	Iterator<Talk> iterator = talks.iterator();

	while (iterator.hasNext()) {
	    Talk talk = iterator.next();
	    if (canSessionAccomodateTalk(session, talk)) {
		addTalkToSession(session, talk);
		iterator.remove();
	    }
	}
    }
}
