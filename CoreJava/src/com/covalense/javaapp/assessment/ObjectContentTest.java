package com.covalense.javaapp.assessment;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.java.Log;

@Log
/*
 * 15) WAP to display the content of object using lambda expression
 */

public class ObjectContentTest {

	public static void main(String[] args) {

		List<Product> productList = new ArrayList<Product>();

		productList.add(new Product(01, "sony bravia", "TV", 20000.00));
		productList.add(new Product(02, "micromax action", "TV", 15000.00));
		productList.add(new Product(03, "sony bravia", "TV", 20000.00));
		productList.add(new Product(04, "sony xpe", "TV", 200040.00));

		productList.stream().forEach(p -> 
			log.info(p.getName() + "  " + p.getPtype() + "  " + p.getCost())
		);
	}// end of main

}// end of class
