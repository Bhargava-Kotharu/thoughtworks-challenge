package com.thoughtworks.challenge.parser;

public interface LineParser<T> {

    public T parseLine(String line);
}
