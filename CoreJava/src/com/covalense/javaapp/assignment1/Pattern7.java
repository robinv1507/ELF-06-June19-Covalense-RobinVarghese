package com.covalense.javaapp.assignment1;

public class Pattern7 {

	public static void main(String[] args) {

		int i, j,b;
		int n = 5;

		for (i = 0; i < n; i++) {

			for (j = (n - i - 1); j > 0; j--) {

				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}for (j = i-1; j < i; j++) {
				for(b=j;b>)
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}

}
