package com.covalense.javaapp.assessment;

import lombok.extern.java.Log;

@Log
public class AtmMachine {

	void slot(Atm atm) {
		atm.validate();
		atm.info();
	}
}
