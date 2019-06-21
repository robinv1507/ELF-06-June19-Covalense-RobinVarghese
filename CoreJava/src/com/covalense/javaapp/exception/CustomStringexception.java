package com.covalense.javaapp.exception;

public class CustomStringexception extends RuntimeException {

	private String message;

	public CustomStringexception(String message)
	{
      this.message=message;
     
	}



	@Override
	public String toString() {
		return message;
	}
	
}
