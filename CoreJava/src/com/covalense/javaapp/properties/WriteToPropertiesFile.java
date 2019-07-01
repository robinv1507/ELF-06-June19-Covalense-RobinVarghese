package com.covalense.javaapp.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * Properties class demo
 * writing the content to the .properties file
 */
public class WriteToPropertiesFile {
	public static void main(String[] args) {
		
		try(FileOutputStream fout=new 
				FileOutputStream("demo.properties");) {
			
			Properties p= new Properties();
			
			p.setProperty("companyName", "covalense");
			p.setProperty("Address","Jakkasandra");
			
			//writing the data to the file
			p.store(fout, "company details");
			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
