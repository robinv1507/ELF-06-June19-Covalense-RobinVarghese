package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListGenericTypeC {
	public static void main(String[] args) {

		/*
		 * Generic String Arraylist0 implementation using *list iterator*
		 */

		ArrayList<String> a = new ArrayList<String>();
		a.add("nilesh");
		a.add("malu");
		a.add("kalbeesh");
		a.add("susu");
		ListIterator<String> ls = a.listIterator();

		while (ls.hasNext()) {
			String d = ls.next();
			System.out.println(d);
		}

	}
}
