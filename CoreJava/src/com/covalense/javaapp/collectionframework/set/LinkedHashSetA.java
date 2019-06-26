package com.covalense.javaapp.collectionframework.set;

import java.util.*;

/*
 * non generic linkedHasSet implementation
 */
public class LinkedHashSetA {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		LinkedHashSet h = new LinkedHashSet();
		h.add("amal");
		h.add("ramesh");
		h.add("jl");

		for (Object r : h) {
			System.out.println(r);
		}
		// using iterator
		System.out.println("\nusing iterator\n");
		Iterator<String> i = h.iterator();
		while (i.hasNext()) {
			Object r = i.next();
			System.out.println(r);
		}

	}//end main

}//end class
