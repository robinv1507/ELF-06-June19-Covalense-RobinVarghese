package com.covalense.javaapp.constructor;

import lombok.extern.java.Log;

/*
 * constructor overloading demo
 */
@Log

public class Ac {
	Ac() {
		log.info("hi iam a o parameterised constructor");
	}

	Ac(int w) {
		log.info("int  parameterised constructor int value is" + w);

	}

	Ac(double j) {
		log.info("Double  parameterised constructor.value is" + j);
	}

}
