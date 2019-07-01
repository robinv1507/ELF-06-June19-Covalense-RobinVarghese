package com.covalense.javaapp.methodreferenceoperator;

import lombok.extern.java.Log;

@Log
/*
 * :: operator demo
 * constructor reference using :: operator
 */
public class TsetProduct {
	public static void main(String[] args) {
		
		MyProduct my=Product::new;
		//
		Product p1=my.getProduct(200000,"phone");
		
		log.info("product name ="+p1.name);
		
	}//main end

}//class end
