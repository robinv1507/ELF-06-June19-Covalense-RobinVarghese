package com.covalense.javaapp.overriding;

import lombok.extern.java.Log;

@Log
public class GearZero extends GearFirst {
	void speed() {
		log.info("Speed is changed to 100 to 150");
	}

}//end of class
