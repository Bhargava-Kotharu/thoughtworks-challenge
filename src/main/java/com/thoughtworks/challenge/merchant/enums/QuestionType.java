package com.thoughtworks.challenge.merchant.enums;

public enum QuestionType {

    HOW_MUCH_IS("how much is"), HOW_MANY_CREDITS("how many Credits");

    private String questionType;

    private QuestionType(String questionType) {
	this.questionType = questionType;
    }

    @Override
    public String toString() {
	return questionType;
    }
}
