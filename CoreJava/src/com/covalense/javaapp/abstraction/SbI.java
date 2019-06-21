package com.covalense.javaapp.abstraction;

public class SbI implements AtmCard {

	public void validate()
	{
		System.out.println("Sbi validation processing");
	}
	public void getInfo()
	{
		System.out.println("Sbi processing the information");
	}
}
