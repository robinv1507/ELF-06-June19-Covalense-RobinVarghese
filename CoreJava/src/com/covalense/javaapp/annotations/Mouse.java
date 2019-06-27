package com.covalense.javaapp.annotations;

import lombok.extern.java.Log;

@Log

/*
 * deprecation demo class
 */
public class Mouse {
	void click() {
		log.info("click ()");
	}

	@Deprecated
	void scroll()// deprecated method
	{

	}

}
