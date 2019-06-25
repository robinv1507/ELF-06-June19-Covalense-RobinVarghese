package com.covalense.javaapp.overriding;

public class Card {
	static int orgcount;
	int count;

	void swipe() {
		orgcount++;
		count++;
	}

}
