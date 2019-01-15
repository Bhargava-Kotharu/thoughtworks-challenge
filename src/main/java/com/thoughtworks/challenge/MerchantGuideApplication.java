package com.thoughtworks.challenge;

import java.io.FileNotFoundException;

import com.thoughtworks.challenge.constants.ApplicationConstants;
import com.thoughtworks.challenge.processor.ConferenceManagementProcessor;
import com.thoughtworks.challenge.processor.Processor;
import com.thoughtworks.challenge.processor.ProcessorFactory;

/**
 * This is the entry point for Conference Management Solution.
 * 
 * @author bkotharu
 *
 */
public class MerchantGuideApplication {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws FileNotFoundException {
	Processor<ConferenceManagementProcessor> processor = ProcessorFactory
		.getProcessor(ApplicationConstants.MERCHANT_GUIDE);
	processor.process(args);
    }
}
