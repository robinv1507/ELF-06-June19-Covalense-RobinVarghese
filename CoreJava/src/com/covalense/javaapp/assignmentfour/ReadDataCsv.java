package com.covalense.javaapp.assignmentfour;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import lombok.extern.java.Log;

import org.apache.commons.csv.*;
@Log
/*
 * reading the csv file data and writing to employee object
 */
public class ReadDataCsv {
	public static void main(String[] args) {

		Employee arr[] = new Employee[5];
		FileReader fr=null;
		CSVParser csv=null;
		try {
			 fr = new FileReader("excel.csv");
			 csv = new CSVParser(fr, CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase());
			int i = 0;
			//writing csv file data into employee object 
			for (CSVRecord csvRecord : csv) {
				Employee e = new Employee();

				e.name = csvRecord.get(0);
				e.age = csvRecord.get(1);
				e.designation = csvRecord.get(2);
				e.salary = csvRecord.get(3);
			
				arr[i++]=e;
			}
			log.info("read");
           //displaying the data 
			for (Employee e : arr) {
				log.info(e.name);
				log.info(e.age);
				log.info(e.designation);
				log.info(e.salary);
				log.info("========");
			}
			
		} catch (FileNotFoundException e) {
			log.info(" " + e);
			} catch (IOException e) {
				log.info(" " + e);			
		    }
		// closing the both csv and fileReader
				finally {
					if (csv != null) {
						try {
							csv.close();

						} catch (IOException e) {
							log.info("" + e);
						}

					} // cp if end
					if (fr != null) {
						try {
							fr.close();
						} catch (IOException e) {
							log.info("" + e);
						}
					} // fr if end

				} // finally end
		
	}//end of main
}//end of class
