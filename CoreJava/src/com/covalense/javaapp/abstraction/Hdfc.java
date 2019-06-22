package com.covalense.javaapp.abstraction;

import lombok.extern.java.Log;

@Log

public class Hdfc implements AtmCard {

	public void validate() {
		log.info( "HDFC validation processing");
	}

	public void getInfo() {
		log.info("HDFC processing the information");
	}
}
