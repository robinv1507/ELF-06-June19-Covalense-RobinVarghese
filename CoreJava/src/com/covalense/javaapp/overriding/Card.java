package com.covalense.javaapp.overriding;

public class Card {
	private static int orgcount;
 static	int count;

	static void swipe() {
		orgcount++;
		count++;
	}

}
