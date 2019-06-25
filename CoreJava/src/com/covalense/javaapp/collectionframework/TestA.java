package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;
/*
 * simple ArrayList program
 */
public class TestA {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add("robin");
		a.add(1);
		a.add(2.2);
		for (Object r : a) {
			System.out.println(r);
		}

	}//end main
}//end class
