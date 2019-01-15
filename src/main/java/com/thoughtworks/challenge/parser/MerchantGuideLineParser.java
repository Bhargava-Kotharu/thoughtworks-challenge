package com.thoughtworks.challenge.parser;

import com.thoughtworks.challenge.merchant.dto.Information;
import com.thoughtworks.challenge.merchant.dto.IntergalacticInput;
import com.thoughtworks.challenge.merchant.dto.InvalidIntput;
import com.thoughtworks.challenge.merchant.dto.Question;
import com.thoughtworks.challenge.merchant.enums.QuestionType;

public class MerchantGuideLineParser implements LineParser<IntergalacticInput> {

    @Override
    public IntergalacticInput parseLine(String line) {
	if (line == null || line.isEmpty()) {
	    return null;
	}
	
	if (line.contains(QuestionType.HOW_MANY_CREDITS.toString().toLowerCase())) {
	    return new Question(line, QuestionType.HOW_MANY_CREDITS);
	} else if (line.contains(QuestionType.HOW_MUCH_IS.toString().toLowerCase())) {
	    return new Question(line, QuestionType.HOW_MUCH_IS);
	} else {
	    try {
		String[] splitStr = line.split("is");
		return new Information(splitStr[0], splitStr[1]);
	    } catch (Exception e) {
		return new InvalidIntput(line);
	    }

	}

    }

}
