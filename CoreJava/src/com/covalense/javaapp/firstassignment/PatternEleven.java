package com.covalense.javaapp.firstassignment;

public class PatternEleven {// class start

	public static void main(String[] args) {// main start
		int n = 20;

		for (int i = 0; i < n; i++) {// i loop begin
			for (int j = 0; j < n; j++) {// j loop begin
				if ((i + j) == n / 2 || (j - i) == n / 2 || (i - j) == n / 2 || (i + j) == (n + (n / 2 - 1))
						|| i == n / 2 || j == n / 2) {// if begin

					System.out.print("*");

				} // end if
				else {
					System.out.print(" ");
				} // else ends

			} // j loop ends
			System.out.println();
		}//i loop ends
		

	}//end main

}//end class
