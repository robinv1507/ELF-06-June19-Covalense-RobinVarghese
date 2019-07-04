package com.covalense.javaapp.assessment;

import lombok.extern.java.Log;

@Log
/*14)	WAP to calculate simple interest using lambda expression*/
public class CalculateSimpleInterestByLambdaEx {

	public static void main(String[] args) {
		int principle = 9000;
		double rate = 7.5;
		int year = 2;
		
		SimpleInterestCalculation s = (p, r, y) -> (p * r * y) / 100;
		
		double res = s.calculateSI(principle, rate, year);
		
		log.info("Simple Interest is " + res);
		
	}//end of main

}//end of class
