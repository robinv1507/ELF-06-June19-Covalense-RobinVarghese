package com.covalense.javaapp.abstraction;

public class AtmMechine {
	
	void swipe(AtmCard a)
	{
		a.validate();
		a.getInfo();
	}

}
