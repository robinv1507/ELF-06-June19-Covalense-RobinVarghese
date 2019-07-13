package com.covalense.javaapp.assessment;

import lombok.extern.java.Log;

@Log
public class Axis implements Atm {

	@Override
	public void info() {
		log.info("Axis Bank Information");
	}

	@Override
	public void validate() {
		log.info("Axis bank --Valid card ");
	}

}
