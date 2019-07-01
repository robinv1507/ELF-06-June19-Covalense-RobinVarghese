package com.covalense.javaapp.methodreferenceoperator;

import lombok.extern.java.Log;

@Log
/*
 * method reference operator demo
 * calculating sum
 */
public class TestAdd {
	
	public static void main(String[] args) {
		
		Add a=Math::sum;
		log.info(""+a.add(2, 3));
		
	}

}
