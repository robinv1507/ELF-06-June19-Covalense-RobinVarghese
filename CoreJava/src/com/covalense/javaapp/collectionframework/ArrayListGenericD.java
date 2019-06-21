package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListGenericD {
	public static void main(String[] args) {

		/*
		 * Generic string Arraylist0 implementation using * iterator*
		 */
		ArrayList<String> a = new ArrayList<String>();
		a.add("nilesh");
		a.add("malu");
		a.add("kalbeesh");
		a.add("susmi");

		Iterator<String> it = a.iterator();
		while (it.hasNext()) {
			String d = it.next();
			System.out.println(d);
		}
	}
}
