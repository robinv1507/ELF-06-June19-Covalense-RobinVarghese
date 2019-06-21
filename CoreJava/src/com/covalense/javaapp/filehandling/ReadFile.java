package com.covalense.javaapp.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class ReadFile {
	public static void main(String[] args) {

		try {
			String File = FileUtils.readFileToString(new File("MyFile.txt"));
			FileUtils.readFileToString(new File("MyFile.txt"), Charset.defaultCharset());
			System.out.println(File);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
