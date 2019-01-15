package com.thoughtworks.challenge.processor;

import com.thoughtworks.challenge.constants.ApplicationConstants;

public class ProcessorFactory {

    @SuppressWarnings("rawtypes")
    public static Processor getProcessor(String processorType) {

	switch (processorType) {
	case ApplicationConstants.CONFERENCE_MGMT:
	    return new ConferenceManagementProcessor();
	case ApplicationConstants.MERCHANT_GUIDE:
	    return new MerchantGuideProcessor();
	default:
	    throw new IllegalArgumentException("");
	}

    }
}
