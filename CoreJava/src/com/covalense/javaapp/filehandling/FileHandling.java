package com.covalense.javaapp.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class FileHandling {

	public static void main(String[] args) {
		try {
			FileUtils.writeStringToFile(new File("MyFile1.txt"), "This is my file !!",Charset.defaultCharset());
			System.out.println("file is created");
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// End of main

}// end of class
