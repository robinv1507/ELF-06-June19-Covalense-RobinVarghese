package com.covalense.javaapp.abstraction;

public class TestF {

	public static void main(String[] args) {

		AtmMechine am = new AtmMechine();
		Hdfc h = new Hdfc();
		SbI s = new SbI();
		ICICI i = new ICICI();
		Canara c = new Canara();

		am.swipe(c);
		am.swipe(i);
		am.swipe(s);
		am.swipe(h);
	}

}
