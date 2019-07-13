package com.covalense.javaapp.assessment;

import lombok.extern.java.Log;

@Log
public class Hdfc implements Atm{

	@Override
	public void info() {
		log.info("HDFC Bank Information");
	}

	@Override
	public void validate() {
		log.info("HDFC bank --Valid card ");
	}

}
