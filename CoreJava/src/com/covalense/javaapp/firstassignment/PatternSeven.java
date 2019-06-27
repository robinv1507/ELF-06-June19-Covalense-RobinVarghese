package com.covalense.javaapp.firstassignment;

public class PatternSeven {
	public static void main(String[] args) {

		int rows = 5;
		System.out.println("## Printing the pattern ##");

		for (int i = 1; i <= rows; i++) {
			// Print space in decreasing order
			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			// Print star in increasing order
			for (int k = 1; k <= i; k++) {
				if (k == 1 || k == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 1; i <= rows - 1; i++) {
			// Print space in increasing order
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			// Print star in decreasing order
			for (int k = rows - 1; k >= i; k--) {
				if (k == rows - 1 || k == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
}