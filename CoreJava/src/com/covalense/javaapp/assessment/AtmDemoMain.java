package com.covalense.javaapp.assessment;
/*
 * 19)	WAP where ATM machine can receive,
 *  any ATM card and print the respective back name
 *
 */
public class AtmDemoMain {
	
	public static void main(String[] args) {
		
		AtmMachine machine = new AtmMachine();
		Hdfc hdfc = new Hdfc();
		Axis axis = new Axis();
		
		machine.slot(hdfc);
	
	}//end of main

}//end of class
