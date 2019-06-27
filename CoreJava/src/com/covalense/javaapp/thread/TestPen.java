package com.covalense.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class TestPen {

	public static void main(String[] args) {

		log.info("main started");
		Pen t1=new Pen();
		t1.setName("thread one");
		t1.start();
		
		Pen t2=new Pen();
		t2.setName("thread Two");
		t2.start();
		
		Pen t3=new Pen();
		t3.setName("thread three");
		t3.start();
		
		
		log.info("main ended");
		
	}//end of main

}//end of class
