package com.covalense.jdbcapp.common;

public class MyClass {

	private MyClass() {}

	public static Connection getInstance(String str) {

		Connection ref = null;

		if (str.equals("one")) {
			ref = new ClassA();

		} else {
			ref = new ClassB();
		}

		return ref;

	}// end of getInstance()

}// end of class
