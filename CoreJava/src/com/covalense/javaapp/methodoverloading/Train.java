package com.covalense.javaapp.methodoverloading;

import lombok.extern.java.Log;

@Log
/*
 * method overloading demo program
 */
public class Train {

	static void search(int id) {
		log.info("searching by train number ");

	}

	void search(String name) {
		log.info("searching by name");
	}

	public static void main(String[] args) {

		search(1212);
	}// end of main

}// end of class
