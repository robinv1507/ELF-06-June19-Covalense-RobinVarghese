package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;

import java.util.ListIterator;

import lombok.extern.java.Log;

@Log
/*
 * Generic String ArrayList implementation, using *list iterator*
 */
public class ArrayListGenericTypeC {
	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		a.add("nilesh");
		a.add("malu");
		a.add("kalbeesh");
		a.add("susu");
		ListIterator<String> ls = a.listIterator();

		while (ls.hasNext()) {
			String d = ls.next();
			log.info(""+d);
		}

	}// main end
}// class end
