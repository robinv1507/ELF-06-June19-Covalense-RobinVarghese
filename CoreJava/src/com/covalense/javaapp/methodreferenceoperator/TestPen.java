package com.covalense.javaapp.methodreferenceoperator;
/*
 * 
 */
public class TestPen {
	public static void main(String[] args) {
		
		PenFactory pf=Pen::new;
		Pen p1=pf.getPen();
		p1.write();
	}

}
