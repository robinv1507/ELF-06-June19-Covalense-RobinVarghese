package com.covalense.javaapp.thread;

import lombok.extern.java.Log;

@Log
/*
 * thread demo
 */
public class TestBrowser {
	public static void main(String[] args) {

		PVR p = new PVR();
		//thread 1
		Browser t1 = new Browser(p);
		t1.start();
		//thread 2
		Browser t2 = new Browser(p);
		t2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
          log.info(""+e);
		}
		
		p.leaveMe();
		
		
	}//end of main

}//end of class
