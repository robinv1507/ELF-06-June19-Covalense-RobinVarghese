package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;

import java.util.Iterator;
import lombok.extern.java.Log;

@Log

/*
 * Generic string Arraylist0 implementation using * iterator*
 */
public class ArrayListGenericD {
	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		a.add("nilesh");
		a.add("malu");
		a.add("kalbeesh");
		a.add("susmi");

		Iterator<String> it = a.iterator();
		while (it.hasNext()) {
			String d = it.next();
			log.info("" + d);
		} // end while
	}// end main
}// end class
