package com.covalense.javaapp.enumexp;

import lombok.extern.java.Log;

@Log
/*
 *switch case demo 
 */
public class SwitchDemo {

	public static void main(String[] args) {

		String t = "apple";
		switch (t) {
		case "apple":
			log.info("hi apple");

			break;
		case "orange":
			log.info("hi orange");

			break;
		case "cat":
			log.info("hi cat");

			break;
		default:
			log.info("wrong input");

		}
	}

}
