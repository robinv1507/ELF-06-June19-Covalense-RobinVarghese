package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log

public class TestD {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30 };
		for (int i = 0; i < a.length; i++) {
			log.info("" + a[i]);
		}
		log.info("" + "**Reverse of the above array ***");

		for (int i = a.length - 1; i >= 0; i--) {
			log.info("" + a[i]);
		}
		char b[] = { 'd', 'i', 'v', 'y', 'a' };
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
	}// end main

}// end class
