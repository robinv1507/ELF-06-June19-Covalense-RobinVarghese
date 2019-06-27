package com.covalense.javaapp.methodreferenceoperator;

public class Math {
	//sum method to calculate sum of two numbers
	static int sum(int a, int b) {

		return a + b;

	}
//factorial non static method-finding fact and returning
	 int factorial(int a) {
		if (a < 1) {
			return 1;
		}
		return factorial(a - 1) * a;
	}//end of fact method

}//end of class
