package com.covalense.javaapp.abstraction;

public class TestE {

	public static void main(String[] args) {

		Browser b=new Browser();
		Gmail g1=new Gmail();
		Gdrive g2=new Gdrive();
		
	      b.open(g1);
	      b.open(g2);
	}

}
