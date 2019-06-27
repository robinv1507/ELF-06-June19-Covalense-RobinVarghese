package com.covalense.javaapp.exception;

public class IRTC {
	void book() {
		System.out.println("Book method started");
		try {
			System.out.println(10 / 0);
		}
		catch (ArithmeticException a) {
			System.out.println(" caught exception at book ()");
			throw a;

		} finally {
			System.out.println("Book method End");
		}
	}

}
