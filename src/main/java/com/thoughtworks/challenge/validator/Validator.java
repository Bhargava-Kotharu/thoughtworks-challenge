package com.thoughtworks.challenge.validator;

import com.thoughtworks.challenge.constants.MessageConstants;

public class Validator {

    public static boolean validateArguments(String[] args) throws IllegalArgumentException {
	if (args.length == 0) {
	    throw new IllegalArgumentException(MessageConstants.INVAID_ARGUMENTS_MESSAGE);
	}
	return true;
    }
}
