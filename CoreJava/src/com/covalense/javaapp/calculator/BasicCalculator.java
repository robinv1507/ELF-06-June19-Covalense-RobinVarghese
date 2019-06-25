package com.covalense.javaapp.calculator;

import lombok.extern.java.Log;

@Log
/*
 * simple calculator program
 */
public class BasicCalculator {// start class

	static void add(double a, double b)// start the add ()
	{
		double s = a + b;
		log.info("addition of "+a+"+"+b +"="+s);
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
		

	}//main end

}//class end
