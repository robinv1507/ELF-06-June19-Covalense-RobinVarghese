package com.covalense.javaapp.abstraction;

import lombok.extern.java.Log;

@Log

public class Gmail extends Google {

	void shareDocs() {
		log.info("" + "share the Gmail documents");

	}
}
