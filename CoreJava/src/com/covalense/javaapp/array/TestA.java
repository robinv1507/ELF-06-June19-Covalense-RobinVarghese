package com.covalense.javaapp.array;

public class TestA {

	public static void main(String[] args) {

		double[] a = new double[3];
		a[0] = 1.2;
		a[1] = 20.0;
		a[2] = 3;	
		for (int i = 0; i < a.length; i++) {// for loop begin
			System.out.println(a[i]);
		}
	}// end of main

}// end of class
