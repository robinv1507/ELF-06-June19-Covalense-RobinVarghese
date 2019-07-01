package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;

import java.util.Iterator;

import lombok.extern.java.Log;

@Log
/*
 * ArrayList implementation using iterator
 */
public class Arraylistiterator {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add("robin");
		a.add(1);
		a.add(2.2);
		a.add('x');
		// displaying the arrayList ussing iterator
		Iterator it = a.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			log.info("" + r);
		} // end while
	}// end main
}// end class
