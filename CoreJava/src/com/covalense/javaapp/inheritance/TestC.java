package com.covalense.javaapp.inheritance;

public class TestC {

	public static void main(String[] args) {

		
		Pen p=new Marker();
		p.cost=10;
		p.write();
		
		/*
		 * using parent type reference variable,
		 *  we cannot access the child members eg:p.color()
		 */
	}

}
