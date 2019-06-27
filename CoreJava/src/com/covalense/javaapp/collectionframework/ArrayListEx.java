package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;
import lombok.extern.java.Log;

@Log
/*
 * non generic ArrayList implementation
 */

public class ArrayListEx {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(22);
		al.add(1);
		al.add("hero");
		al.add(4);
		// printing array list
		for (int i = 0; i < al.size(); i++) {
			Object r = al.get(i);
			log.info("" + r);
		} // for loop end
	}// main end
}// class end
