package com.covalense.javaapp.assignmentfifth;

import java.util.logging.Logger;

public class ValidNum {
	private static final Logger log=Logger.getLogger("log1");

	int s;

	void valid(int s) throws NotValidNum {
		this.s = s;
		if (s > 0) {
			log.info("valid Number");
		} else {
			throw new NotValidNum();
		}
	}//main end

}//class end
