package com.covalense.javaapp.abstraction;

import lombok.extern.java.Log;

@Log

/*
 * demonstration of a abstract class
 */
public abstract class Pencil {
	void drow() {
		log.info("iam a drow method");
	}

	abstract void write();

	abstract void color();

}
