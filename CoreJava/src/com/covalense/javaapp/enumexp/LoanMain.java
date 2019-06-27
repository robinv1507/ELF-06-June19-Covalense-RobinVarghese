package com.covalense.javaapp.enumexp;

import lombok.extern.java.Log;

@Log
/*
 * enum demo - accessing enum value
 */
public class LoanMain {

	public static void main(String[] args) {
		Loan l=Loan.HOME;
		
		int constValue=l.getValue();
		log.info(" value of home is "+constValue);
		
	}//end of main
}//end of class
