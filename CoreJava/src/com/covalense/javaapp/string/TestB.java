package com.covalense.javaapp.string;

public class TestB {

	public static void main(String[] args) {

		String x="40";
		String y="50";
		
		System.out.println(x+y);
		
		int i=Integer.parseInt(x);
		int j=Integer.parseInt(y);
		System.out.println(i+j);
		
		System.out.println("******");

		String s="4.9";
		double d=Double.parseDouble(s);
		System.out.println(d+i);
	}

}
