package com.covalense.javaapp.assignmentfour;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import lombok.extern.java.Log;

@Log
/*
 * reading the csv file data and displaying
 */
public class ReadCsv {
	public static void main(String[] args) {

		
		try(FileReader fr = new FileReader("excel.csv");
				CSVParser cp = new CSVParser(fr, CSVFormat.DEFAULT);) {
			

			for (CSVRecord csvRecord : cp) {
				// Accessing Values by Column Index
				String name = csvRecord.get(0);
				String age = csvRecord.get(1);
				String designation = csvRecord.get(2);
				String salary = csvRecord.get(3);

				log.info("name : " + name);
				log.info("age : " + age);
				log.info("designation : " + designation);
				log.info("Salary : " + salary);

				log.info("---------------\n\n");
			} // for each end
		} catch (FileNotFoundException e) {
			log.info(" " + e);
		} catch (IOException e) {
			log.info(" " + e);
		}
		

	}// end of main
}// end of class
