package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistiterator {

	public static void main(String[] args) {
		/*
		 * Arraylist0 implementation using *iterator* inteface0 
		 */
		
		ArrayList a = new ArrayList();
		a.add("robin");
		a.add(1);
		a.add(2.2);
		a.add('x');
		
		Iterator it=a.iterator();
		while(it.hasNext())
		{
			Object r=it.next();
			System.out.println(r);
		}
	}
}
