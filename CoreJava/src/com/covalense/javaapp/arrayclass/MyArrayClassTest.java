package com.covalense.javaapp.arrayclass;

import lombok.extern.java.Log;

@Log // logger
public class MyArrayClassTest {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		MyArrayClass m = new MyArrayClass();
		int dataSize = 19;
		int removeIndex = 12;

		// adding 5 values
		for (int i = 0; i < dataSize; i++) {

			m.add("value" + i);

		}//for loop end

		log.info("Removing the " + removeIndex + "th position");

		m.remove(removeIndex);

		// getting values
		for (int i = 0; i < dataSize; i++) {

			log.info("output : " + m.get(i));

		}//for loop end

		long endTime = System.currentTimeMillis();

		log.info("total excecution: " + (endTime - startTime) + "ms");
	}// end of main

}// end of class
