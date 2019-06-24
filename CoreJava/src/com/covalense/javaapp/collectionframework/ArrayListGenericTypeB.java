package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;

import java.util.ListIterator;

import lombok.extern.java.Log;

@Log
/*
 * Generic double Arraylist0 implementation using *list iterator*
 */
public class ArrayListGenericTypeB {
	public static void main(String[] args) {

		ArrayList<Double> a = new ArrayList<Double>();
		a.add(1.2);
		a.add(1.3);
		a.add(2.2);
		a.add(2.3);
		ListIterator<Double> ls = a.listIterator();

		while (ls.hasNext()) {
			Double d = ls.next();
			log.info("" + d);
		}

	}// main end
}// class end
