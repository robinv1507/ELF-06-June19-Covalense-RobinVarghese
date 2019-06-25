package com.covalense.javaapp.abstraction;

import lombok.extern.java.Log;

@Log

public class SbI implements AtmCard {

	public void validate() {
		log.info("Sbi validation processing");
	}

	public void getInfo() {
		log.info("Sbi processing the information");
	}
}
