package com.covalense.javaapp.assessment;

import lombok.extern.java.Log;

@Log
/*
 * 25)	WAP to compare the equality of two objects.
 */
public class ObjectEqualityTest {

	public static void main(String[] args) {


		Product p1 = new Product(01, "sony bravia", "TV", 20000.00);
		Product p2 = new Product(02,"micromax action", "TV", 15000.00);
		Product p3 = new Product(01,"sony bravia", "TV", 20000.00);
		
		log.info(""+p1.equals(p3));
	}//end of main

}//end of class
