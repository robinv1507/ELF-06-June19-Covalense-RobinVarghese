package com.covalense.javaapp.assessment;

public class TempCustomException extends RuntimeException {

	 String message;
	
	
	public TempCustomException(String msg) {
		this.message = msg;
	}

	@Override
	public String toString() {
		return message ;
	}
	
}//end of class
