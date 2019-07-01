package com.covalense.javaapp.abstraction;

import lombok.extern.java.Log;

@Log
// child class pen defining the abstract methods
public class Pen extends Pencil {

	void write() {
		log.info("iam a write method");
	}

	void color() {
		log.info("iam a color method");
	}

}
