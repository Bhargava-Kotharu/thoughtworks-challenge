package com.thoughtworks.challenge.constants;

import java.util.regex.Pattern;

public interface ApplicationConstants {

    // Generic Constants
    String CONFERENCE_MGMT = "CONFERENCE_MGMT";
    String MERCHANT_GUIDE = "MERCHANT_GUIDE";

    // Conference Management Constants
    Pattern CONFERENCE_MGMT_PATTERN = Pattern.compile("^(.+)\\s(\\d+)?\\s?((min)|(lightning))$");
    String LIGHTNING = "ligntning";
    String LUNCH = "Lunch";
    String DEFAULT_TALK_DURATION = "1";
    int MORNING_SESSION_DURATION = 180;
    int LUNCH_DURATION = 60;
    int AFTERNOON_SESSION_DURATION = 180;
    int EVENING_SESSION_DURATION = 240;

    // Merchant's Guide Constants

}
