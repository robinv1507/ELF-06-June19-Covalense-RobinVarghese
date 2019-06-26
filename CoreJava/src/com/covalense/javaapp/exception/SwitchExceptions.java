package com.covalense.javaapp.exception;

import lombok.extern.java.Log;

@Log
/*
 * new catch block demo
 */
public class SwitchExceptions {

	public static void main(String[] args) {

		 try {
			
			 
			 
		} catch (ArithmeticException  | NullPointerException ae) {
			
			log.info(ae.getMessage());
		}
		
		 catch (Exception e) {
			 log.info("general catch block");	
		}
	}//end of main

}//end of class
