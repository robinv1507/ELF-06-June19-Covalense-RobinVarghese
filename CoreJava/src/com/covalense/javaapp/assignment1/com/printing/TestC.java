package com.printing;

public class TestC {// start class

	public static void main(String[] args) {// start main
		/*
		 * printing odd numbers that,
		 *  are divisible by 7 from 1 - 100
		 */

		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 1 && i % 7 == 0) {
				System.out.println(i);

			}

		}

	}// end main

}// end class
