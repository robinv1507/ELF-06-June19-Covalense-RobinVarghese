package com.covalense.javaapp.methodreferenceoperator;

import lombok.extern.java.Log;

@Log
public class Pen {
	Pen()
	{
	  log.info("pen  zero parameterized contructor called");	
	}
	void write()
	{
		log.info("pen  write method called");	
	}

}//class end
