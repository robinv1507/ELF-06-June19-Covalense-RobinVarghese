package com.covalense.javaapp.immutableclass;

public class Marker {
	
	private final static  Marker m=new Marker();
	
	private Marker()
	{
		
	}


	public static Marker getM() {
		return m;
	}
	

}
