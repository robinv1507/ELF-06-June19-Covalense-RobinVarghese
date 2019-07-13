package com.covalense.javaapp.assessment;

import lombok.extern.java.Log;

@Log
/*
 * 30)	WAP to create immutable class.
 */
public class ImmutableClassTest {

	public static void main(String[] args) {

		ImmutableClass imc = new ImmutableClass(29, "ROBIN");
		log.info("" + imc.getAge());
		log.info("" + imc.getName());
	}
}
