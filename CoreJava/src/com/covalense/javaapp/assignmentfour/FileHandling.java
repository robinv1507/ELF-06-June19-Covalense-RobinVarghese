package com.covalense.javaapp.assignmentfour;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

public class FileHandling {
    public static void main(String[] args) {
    	
		FileWriter f;
		try {
			BufferedWriter bf=new BufferedWriter(new FileWriter("excel.csv"));
	    CSVPrinter csv=new CSVPrinter(bf, CSVFormat.DEFAULT.withHeader("Name", "Age","Designation","Salary"));
	    
	    csv.printRecord("Sundar Pichai","23","tester","25000");
	    csv.flush();
	    System.out.println("file is written");
		} catch (IOException e) {
			e.printStackTrace();
		}
      
	}
}
