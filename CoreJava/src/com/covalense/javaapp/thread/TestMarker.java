package com.covalense.javaapp.thread;

public class TestMarker {
	public static void main(String[] args) {
		
		Marker m=new Marker();
		
		Thread t1=new Thread(m);
		t1.start();
		
		//thread 2
		Thread t2=new Thread(m);
		t2.start();
		
				
		
	}

}
