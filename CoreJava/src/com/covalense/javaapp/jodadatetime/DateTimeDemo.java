package com.covalense.javaapp.jodadatetime;

import java.time.LocalDate;
import java.time.Period;

import lombok.extern.java.Log;
@Log
/*
 * java time package  simple demo, 
 * LocalDate class methods demo
 */
public class DateTimeDemo {
	public static void main(String[] args) {
		
		
		LocalDate a=LocalDate.now();
		LocalDate currentDate=LocalDate.now();
		LocalDate br= LocalDate.of(1998, 7,15);
		
		
		log.info("current month is "+a.getMonth());
		
		log.info("current Date is "+LocalDate.now());
		
		log.info("current month day is "+a.getDayOfMonth());
		
		log.info("current day of the week is "+a.getDayOfWeek());
		
		//calculating age  
		
		Period d=Period.between(br,currentDate);
		
		log.info("your age is "+d.getYears());
		
		
	}//end of main

}//end of class
