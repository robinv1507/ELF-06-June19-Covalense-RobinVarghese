package com.covalense.javaapp.thread;

public class Browser extends Thread {
	
	PVR ref;

	public Browser(PVR ref) {
		this.ref = ref;
	}
	@Override
	public void run() {
		ref.book();
	}//run method end
	

}//end of class
