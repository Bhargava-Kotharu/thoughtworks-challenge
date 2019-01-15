package com.thoughtworks.challenge.merchant.dto;

public class InvalidIntput implements IntergalacticInput {

    String input;

    public InvalidIntput(String input) {
	super();
	this.input = input;
    }

    public String getInput() {
	return input;
    }

    public void setInput(String input) {
	this.input = input;
    }

    @Override
    public String toString() {
	return "InvalidIntput [input=" + input + "]";
    }

}
