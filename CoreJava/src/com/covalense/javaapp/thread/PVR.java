package com.covalense.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class PVR {

	synchronized void book() {

		for (int i = 0; i < 5; i++) {
			log.info("" + i);
			try {
				wait();
			} catch (InterruptedException e) {
				log.severe("" + e);
			}
		} // end of for loop

	}// end of book method

	synchronized void leaveMe() {
		notifyAll();
	}

}
