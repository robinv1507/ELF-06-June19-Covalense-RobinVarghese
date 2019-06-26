package com.covalense.javaapp.assignmentfour;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

import lombok.extern.java.Log;

@Log
/**
 * 
 * @author ROBIN
 *  program to read
 *  the file1 data and write to file2
 *
 */
public class FileReadWrite {// class begin

	public static void main(String[] args) {// main begin
         
		File f1=new File("file1.txt");
		File f2=new File("file2.txt");
		try {
			//file1 creation with content
			FileUtils.writeStringToFile(f1,
					"this is an txt  file of file1",
					Charset.defaultCharset());
			
			//reading the file1 content to
			String s=FileUtils.readFileToString(f1,
					Charset.defaultCharset());
			
			//writing the file1 content to file2
			FileUtils.writeStringToFile(f2,s,
					Charset.defaultCharset());
			
			//reading the file2 content to printing
			String s2=FileUtils.readFileToString(f1,
					Charset.defaultCharset());
			
			//printing the file 2 content
			log.info("file 2 content -:"+s2);
			
			
		} catch (IOException e) {
			log.info("io exception");
		}

	}// end of main

}// end of class
