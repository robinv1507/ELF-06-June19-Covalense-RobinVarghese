package com.covalense.javaapp.firstassignment;

public class PatternSix {

	public static void main(String[] args) {
		int i, j;
		int n = 4;

		for (i = 0; i < n; i++) {

			for (j = (n - i - 1); j > 0; j--) {

				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}

}
