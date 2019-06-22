package com.covalense.javaapp.assignmentsix;

import lombok.extern.java.Log;

@Log
/*
 * lamda exp for factorial of a number
 */
public class Prob2 {

	public static void main(String[] args) {
		Factorial f = a -> {
			int k = 1;
			for (int i = 1; i <= a; i++) {
				k = k * i;
			} // for loop end
			return k;
		};// Lamda exp end

		int result = f.fact(5);
		log.info("" + result);
	}// main end

}// class end
