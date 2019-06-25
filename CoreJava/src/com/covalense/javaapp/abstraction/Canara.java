package com.covalense.javaapp.abstraction;

import lombok.extern.java.Log;

@Log

public class Canara implements AtmCard {

	public void validate() {
		log.info("" + "CANARA validation processing");
	}

	public void getInfo() {
		log.info("" + "CANARA processing the information");
	}

}
