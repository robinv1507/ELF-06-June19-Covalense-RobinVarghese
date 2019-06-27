package com.covalense.javaapp.methodreferenceoperator;

import lombok.extern.java.Log;

@Log
/*
 * method reference operator demo
 */
public class TestRoom {
	
	static void open()
	{
		log.info("open method");
	}
	public static void main(String[] args) {
		
		
		Room r=TestRoom::open;
		
		r.remove();
	}//main end

}//class end
