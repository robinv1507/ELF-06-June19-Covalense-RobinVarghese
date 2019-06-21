package com.covalense.javaapp.calculator;

public class BasicCalculator {// start class

	static void add(double a, double b)// start the add ()
	{
		double s = a + b;
		System.out.println("addition of "+a+"+"+b +"="+s);
	}// end add()

	static double sub(int a, int b)// start the sub ()
	{
		double s = a - b;
		return s;
	}// end sub()

	public static void main(String[] args) {// start main

		double a = 12;
		double b = 13;
		add(a, b);
		

	}

}
