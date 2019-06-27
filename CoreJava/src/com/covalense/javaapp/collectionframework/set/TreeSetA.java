package com.covalense.javaapp.collectionframework.set;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * non generic treeSet implementation
 */
public class TreeSetA {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		TreeSet h = new TreeSet();
		h.add(2);
		h.add(6);
		h.add(3);
		// by default treeSet will be ascending sort will be happen

		for (Object r : h) {
			System.out.println(r);
		}
		// using iterator
		System.out.println("\nusing iterator");
		Iterator i = h.iterator();
		while (i.hasNext()) {
			Object r = i.next();
			System.out.println(r);
		}
	}//end main

}//end class
