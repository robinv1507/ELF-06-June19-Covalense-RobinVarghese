package com.covalense.javaapp.finalkeyword;

import lombok.extern.java.Log;
/*
 * final variable demo
 */
class P {

	final int j;

	P() {
		j = 10;
	}

	P(int j) {
		this.j = j;
	}

}

@Log
public class TestA {

	public static void main(String[] args) {

		P a = new P();
		log.info("" + a.j);

		P a1 = new P(9);
		log.info("" + a1.j);

	}

}//end class testA
