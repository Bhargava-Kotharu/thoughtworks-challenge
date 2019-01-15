package com.thoughtworks.challenge.processor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.challenge.conference.dto.ConferenceSchedule;
import com.thoughtworks.challenge.conference.dto.Talk;
import com.thoughtworks.challenge.constants.ApplicationConstants;
import com.thoughtworks.challenge.merchant.dto.IntergalacticInput;
import com.thoughtworks.challenge.merchant.dto.MerchantGuide;
import com.thoughtworks.challenge.parser.LineParser;
import com.thoughtworks.challenge.parser.MerchantGuideLineParser;
import com.thoughtworks.challenge.parser.ParserFactory;
import com.thoughtworks.challenge.utils.FileUtils;

public class MerchantGuideProcessor extends Processor<MerchantGuide> {

    @Override
    public BufferedReader read(File file) throws FileNotFoundException {
	return FileUtils.getBufferedReaderFromFile(file);
    }

    @Override
    public MerchantGuide parse(BufferedReader reader) {

	@SuppressWarnings("rawtypes")
	LineParser parser = ParserFactory.getParser(ApplicationConstants.MERCHANT_GUIDE);
	List<IntergalacticInput> inputList = new ArrayList<>();
	reader.lines().forEach(line -> {
	    IntergalacticInput input = (IntergalacticInput) parser.parseLine(line);
	    inputList.add(input);
	});
	return initializeMerchantGuide(inputList);
    }

    @Override
    public MerchantGuide process(MerchantGuide input) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void write(MerchantGuide output) {
	System.out.println(output);
    }

    public MerchantGuide initializeMerchantGuide(List<IntergalacticInput> inputList) {
	MerchantGuide guide = new MerchantGuide();
	guide.setInputs(inputList);
	return guide;
    }

}
