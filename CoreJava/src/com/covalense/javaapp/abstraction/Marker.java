package com.covalense.javaapp.abstraction;

import lombok.extern.java.Log;

@Log

public class Marker extends Pen {
	void color() {
		log.info("iam a color method");
	}

}
