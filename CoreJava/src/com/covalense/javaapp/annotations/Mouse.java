package com.covalense.javaapp.annotations;

/*
 * deprecation demo class
 */
public class Mouse {
	void click() {
		System.out.println("click ()");
	}

	@Deprecated
	void scroll()// deprecated method
	{

	}

}
