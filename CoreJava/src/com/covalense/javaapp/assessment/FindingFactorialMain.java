package com.covalense.javaapp.assessment;
import java.util.function.Function;

import lombok.extern.java.Log;

@Log
/*
 * WAP to calculate factorial using lambda expression
 */
public class FindingFactorialMain {

	public static void main(String[] args) {
		int number = 6;
		//finding factorial of number 5
		Function<Integer, Integer> as = f -> {
			int fact = 1;
			for (int i = 1; i <= f; i++) {

				fact = fact * i;

			}
			return fact;
		};
         
		int a = as.apply(number);
		//displaying the factorial
		log.info("factorial of the number " + number + " is " + a);

	}// end of main

}// end of class
