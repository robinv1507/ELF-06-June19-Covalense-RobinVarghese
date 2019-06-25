package com.covalense.javaapp.exception;

@SuppressWarnings("serial")
public class CustomStringexception extends RuntimeException {

	 private final String message;

	public CustomStringexception(String message) {
		this.message = message;

	}

	@Override
	public String toString() {
		return message;
	}

}
