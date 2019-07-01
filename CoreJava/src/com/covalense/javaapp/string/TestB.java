package com.covalense.javaapp.string;

import lombok.extern.java.Log;

@Log
/*
 * parsing demo program
 */
public class TestB {

	public static void main(String[] args) {

		String x="40";
		String y="50";
		
		log.info(x+y);
		
		int i=Integer.parseInt(x);
		int j=Integer.parseInt(y);
		int c=i+j;
		log.info(""+c);
		
		log.info("******");

		String s="4.9";
		double d=Double.parseDouble(s);
		double v=d+i;
		log.info(""+v);
	}//end of main

}//end of class
