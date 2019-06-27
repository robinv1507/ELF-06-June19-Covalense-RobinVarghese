package com.covalense.javaapp.firstassignment;
public class PatternNineB

{
	public static void main(String[] args) {

		int rows = 5;
		System.out.println("## Printing the pattern ##");

		// Print i number of stars
		for (int i = 1; i <= (rows * 2 - 1); i++) {
			for (int j = 1; j <= rows; j++) {
				if (j == i || j == rows - i + 1) {
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}