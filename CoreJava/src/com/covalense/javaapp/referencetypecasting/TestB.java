package com.covalense.javaapp.referencetypecasting;

public class TestB {

	public static void main(String[] args) {

		Pen p=new Marker();//up casting
		Marker m=(Marker)p;//down casting
		m.cost=20;
		m.color();
		m.write();
		
		
	}

}
