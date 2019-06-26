package com.covalense.javaapp.enumexp;
import lombok.extern.java.Log;

@Log
/*
 * 
 */
public class GenderMain {

	public static void main(String[] args) {
		// will return the index
		log.info("" + Gender.MALE.ordinal());
		log.info("" + Gender.FEMALE.ordinal());

		Gender t = Gender.FEMALE;
		switch (t) {
		case MALE:
			log.info("its male");

			break;
		case FEMALE:
			log.info("its female");

			break;
		case OTHERS:
			log.info("its cross gender");

			break;

		}

	}

}
