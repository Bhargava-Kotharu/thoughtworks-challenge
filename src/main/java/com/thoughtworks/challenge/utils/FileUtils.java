package com.thoughtworks.challenge.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileUtils {

    public static File getFile(String filePath) {
	return new File(filePath);
    }

    public static BufferedReader getBufferedReaderFromFile(File file) throws FileNotFoundException {
	return new BufferedReader(new FileReader(file));
    }
}
