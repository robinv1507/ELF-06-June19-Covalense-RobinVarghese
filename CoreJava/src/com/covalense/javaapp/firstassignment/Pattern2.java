package com.covalense.javaapp.firstassignment;

public class Pattern2 {
	public static void main(String[] args) {

		for (int i = 3; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {

				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
