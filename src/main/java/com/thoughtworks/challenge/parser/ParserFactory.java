package com.thoughtworks.challenge.parser;

import com.thoughtworks.challenge.constants.ApplicationConstants;

public class ParserFactory {

    @SuppressWarnings("rawtypes")
    public static LineParser getParser(String parserType) {

	switch (parserType) {
	case ApplicationConstants.CONFERENCE_MGMT:
	    return new ConferenceManagementLineParser();
	case ApplicationConstants.MERCHANT_GUIDE:
	    return new MerchantGuideLineParser();
	default:
	    throw new IllegalArgumentException("");
	}

    }
}
