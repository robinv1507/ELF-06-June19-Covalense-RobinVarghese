package com.covalense.javaapp.collectionframework.vector;

import java.util.Iterator;

import java.util.ListIterator;
import java.util.Vector;

import lombok.extern.java.Log;

/*
 * non generic vector implementation
 */
@Log

public class VectorA {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(2);
		v.add(2.3);
		v.add("nilesh");

		log.info(" " + v);// simple display

		for (int i = 0; i < v.size(); i++)// for loop display linked list
		{

			Object r = v.get(i);
			log.info(" " + r);
		}

		for (Object r : v)// using for each loop
		{
			log.info(" " + r);

		}

		// using iterator

		Iterator i = v.iterator();

		while (i.hasNext()) {
			Object obj = i.next();
			log.info(" " + obj);
		}

		// using List iterator

		ListIterator k = v.listIterator();

		log.info("list iterator");
		while (k.hasNext()) {
			Object o = k.next();
			log.info(" " + o);
		}
		log.info("back word\n");

		while (k.hasPrevious()) {
			Object o = k.previous();
			log.info(" " + o);
		}

	}// end main

}// end class
