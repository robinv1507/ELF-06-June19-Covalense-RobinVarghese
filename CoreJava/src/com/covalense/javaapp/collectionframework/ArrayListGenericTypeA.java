package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;
import lombok.extern.java.Log;

@Log
/*
 * ArrayList implementation using *List iterator*
 */
public class ArrayListGenericTypeA {

	public static void main(String[] args) {

		ArrayList<Double> a = new ArrayList<Double>();
		a.add(1.2);
		a.add(1.3);
		a.add(2.2);
		a.add(2.3);

		for (Double r : a) {
			log.info(""+r);
		}
	}// main end
}// class end
