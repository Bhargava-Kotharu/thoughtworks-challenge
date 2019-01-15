package com.thoughtworks.challenge.merchant.dto;

import com.thoughtworks.challenge.merchant.enums.QuestionType;

public class Question implements IntergalacticInput {

    String question;
    QuestionType questionType;

    public Question(String question, QuestionType questionType) {
	super();
	this.question = question;
	this.questionType = questionType;
    }

    public String getQuestion() {
	return question;
    }

    public QuestionType getQuestionType() {
	return questionType;
    }

    public void setQuestion(String question) {
	this.question = question;
    }

    public void setQuestionType(QuestionType questionType) {
	this.questionType = questionType;
    }

    @Override
    public String toString() {
	return "Question [question=" + question + ", questionType=" + questionType + "]";
    }

}
