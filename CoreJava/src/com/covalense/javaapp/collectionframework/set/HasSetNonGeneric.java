package com.covalense.javaapp.collectionframework.set;

import java.util.HashSet;

import java.util.Iterator;

import lombok.extern.java.Log;


/*
 * non generic HasSet implementation
 */
@Log

public class HasSetNonGeneric {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet h = new HashSet();
		h.add(2);
		h.add(2.0);
		h.add("jl");
		// printing using for each loop
		for (Object r : h) {
			log.info("" + r);
		}
		// printing using iterator
		log.info("\nusing iterator");
		Iterator i = h.iterator();
		while (i.hasNext()) {
			Object r = i.next();
			log.info(" " + r);
		}

	}// end main

}// end class
