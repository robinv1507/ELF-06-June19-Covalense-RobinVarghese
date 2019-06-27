package com.covalense.javaapp.methodoverloading;

import lombok.extern.java.Log;

@Log

public class Girl {

	void recieve(Phone p) {

		if (p instanceof Iphone) {
			log.info("i love you");
		} else if (p instanceof Miphone) {
			log.info("Thank you brother");
		}

	}// end of receive()

}// end of class
