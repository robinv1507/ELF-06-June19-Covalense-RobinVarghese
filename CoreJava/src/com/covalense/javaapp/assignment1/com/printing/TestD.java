package com.printing;

public class TestD {//start class
	public static void main(String[] args) {// start main
		/*
		 * printing even numbers that,
		 *  are divisible by 5 from 50 - 100
		 */
		
		for (int i = 50; i <= 100; i++) {

			if (i % 2 == 0 && i % 5 == 0) {
				System.out.println(i);

			}
			
		}

	}// end main

}// end class