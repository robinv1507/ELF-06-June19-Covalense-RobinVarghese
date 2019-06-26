package com.covalense.javaapp.overriding;

import lombok.extern.java.Log;

/*
 * method overriding demo
 */
@Log

public class TestCard {

	public static void main(String[] args) {

		Card j=new Card();
		Card a=new Card();
		
		j.swipe();
		a.swipe();
		a.swipe();
		
		log.info("java count is "+j.count);
		System.out.println("angular count is "+a.count);
		System.out.println(" JSyders count is "+Card.orgcount);
	}

}
