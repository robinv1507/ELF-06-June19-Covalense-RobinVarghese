package com.covalense.javaapp.firstassignment;

public class PatternTwelve {
	public static void main(String[] args) {//main begin
		int n = 9;

		for (int i = 0; i < n; i++) {// i loop begin
			for (int j = 0; j < n; j++) {// j loop begin
				if (i==0 || j==0 || j==n/2 || i==n/2 
						 || i==n-1 || j==n-1 || i==j ||i+j==n-1) {// if begin

					System.out.print("*");

				} // end if
				else {
					System.out.print(" ");
				} // else ends

			} // j loop ends
			System.out.println();
		} // i loop ends

	}// main end

}
