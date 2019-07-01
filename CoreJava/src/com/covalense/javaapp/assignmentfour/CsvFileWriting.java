package com.covalense.javaapp.assignmentfour;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import lombok.extern.java.Log;

@Log
/*
 * writing the data to csv file using, appache commons csv
 */
public class CsvFileWriting {
	public static void main(String[] args) {

		try (FileWriter fw = new FileWriter("excel.csv");
				CSVPrinter csv = new CSVPrinter(fw,
						CSVFormat.DEFAULT.withHeader("Name", "Age", "Designation", "Salary"));) {

			csv.printRecord("ram krishna", "23", "admin", "2000");

			log.info("file is written");
		} catch (IOException e) {
			log.info("" + e);
		}

	}// main end
}// class end
