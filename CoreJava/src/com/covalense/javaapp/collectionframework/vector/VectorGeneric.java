package com.covalense.javaapp.collectionframework.vector;

import java.util.Enumeration;
import java.util.Vector;

import lombok.extern.java.Log;
@Log
public class VectorGeneric {
	public static void main(String[] args) {
		// Generic vector [list] implementation 

		Vector<Integer> v = new Vector<Integer>();
		v.add(2);
		v.add(3);
		v.add(9);

		//System.out.println("wlecome to \"covalense\" ");
		log.info(""+v);// simple display

		// using enumeration object

		Enumeration<Integer> e = v.elements();
		while (e.hasMoreElements()) {
			Integer k = e.nextElement();
			log.info(""+k);
		}
	}

}
