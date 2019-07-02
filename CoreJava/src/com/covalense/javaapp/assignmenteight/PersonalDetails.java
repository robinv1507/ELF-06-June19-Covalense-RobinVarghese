package com.covalense.javaapp.assignmenteight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

@Log
/*
 * writing and reading the personal,
 *  content from the .properties file
 */
public class PersonalDetails {

	public static void main(String[] args) {

		try (FileOutputStream fout = new FileOutputStream("personal.properties");
				FileInputStream fin=new FileInputStream("personal.properties");  ) {

			Properties propertiesWrite = new Properties();
 
			propertiesWrite.setProperty("Name", "robin");
			propertiesWrite.setProperty("Address", "Jakkasandra");

			// writing the data to the file
			propertiesWrite.store(fout, "personal details");
			
			//reading the data
			Properties propertiesRead = new Properties();
			propertiesRead.load(fin);
			
			String name=propertiesRead.getProperty("Name");
			log.info("name is "+name);

		} catch (FileNotFoundException e) {
			log.info("" + e);
		} catch (IOException e) {
			log.info("" + e);
		}

	}//end of main

}//end of class
