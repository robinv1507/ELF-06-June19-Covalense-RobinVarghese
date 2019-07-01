package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
/*
 * simple ArrayList program
 */
public class TestA {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add("robin");
		a.add(1);
		a.add(2.2);
		for (Object r : a) {
			log.info("" + r);
		}

	}// end main
}// end class
