package com.covalense.javaapp.abstraction;

public class Hdfc implements AtmCard {


	public void validate()
	{
		System.out.println("HDFC validation processing");
	}
	public void getInfo()
	{
		System.out.println("HDFC processing the information");
	}
}
