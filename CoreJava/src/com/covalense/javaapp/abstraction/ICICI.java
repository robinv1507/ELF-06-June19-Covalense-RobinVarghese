package com.covalense.javaapp.abstraction;

import lombok.extern.java.Log;

@Log

public class ICICI implements AtmCard {

	public void validate() {
		log.info("ICICI validation processing");
	}

	public void getInfo() {
		log.info("ICICI processing the information");
	}

}
