package com.covalense.javaapp.stream;

import lombok.extern.java.Log;

@Log
/*
 * 
 */
public class TestB {
	public static void main(String[] args) {
		
		
		Pen p=new Pen();
		
		Demo d=p::write;
		d.print(4);
		
		//or
		
		Demo a=x->log.info(""+x);
		a.print(2);
	}

}
