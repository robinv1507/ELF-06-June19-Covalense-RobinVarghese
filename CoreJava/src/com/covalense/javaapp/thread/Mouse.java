package com.covalense.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class Mouse implements Runnable {

	String name;

	public Mouse(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		log.info(name+"started");
		for (int i = 0; i < 5; i++) {
			log.info("" + name + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				log.severe("" + e);
			}
			log.info(name+"completed");
		} // end of for loop

	}// end of run

}
