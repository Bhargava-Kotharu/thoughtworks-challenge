package com.thoughtworks.challenge.processor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;

import com.thoughtworks.challenge.utils.FileUtils;
import com.thoughtworks.challenge.validator.Validator;

public abstract class Processor<T> {

    public abstract BufferedReader read(File file) throws FileNotFoundException;

    public abstract T parse(BufferedReader reader);

    public abstract T process(T input);

    public abstract void write(T output);

    public void process(String[] args) throws FileNotFoundException {

	if (Validator.validateArguments(args)) {
	    File inputFile = FileUtils.getFile(args[0]);
	    BufferedReader reader = this.read(inputFile);
	    T t = this.parse(reader);
	    this.process(t);
	    this.write(t);
	}

    }
}
