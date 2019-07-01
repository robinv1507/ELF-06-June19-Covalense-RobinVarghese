package com.covalense.javaapp.filehandling;

import java.io.File;

import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

import lombok.extern.java.Log;

@Log
public class FileHandlingExampleTwo {

	public static void main(String[] args) {

		try {
			String fileData = FileUtils.readFileToString(new File("file1.txt"), Charset.defaultCharset());
			log.info("" + fileData);
		} catch (IOException e) {
			log.info("IOException");
		}

	}// end main

}// end class
