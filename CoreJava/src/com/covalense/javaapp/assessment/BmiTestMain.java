package com.covalense.javaapp.assessment;
import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
/*
 * WAP to return the result of the BMI based on, the BMI value, using lambda
 * expression
 */
public class BmiTestMain {

	public static void main(String[] args) {

		double bmi=200;
		
		Predicate<Double> p = b -> b > 100;

		if (p.test(bmi)) {
			log.info("noraml bmi fine");
		} else {
			log.info("under wieght bmi fine");
		}

	}// end of main

}// end of class
