package com.covalense.javaapp.firstassignment;

public class Pattern5 {

	public static void main(String[] args) {

		int i, j;
		int n = 5;

		for (i = n-1; i >= 0; i--) {
			
			for (j = n - i-1; j > 0; j--) {

				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
