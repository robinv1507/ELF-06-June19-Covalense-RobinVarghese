package com.covalense.javaapp.methodreferenceoperator;

import lombok.extern.java.Log;

@Log
/*
 * constructor reference using operator
 */
public class TestBoy {
	public static void main(String[] args) {

		MyBoy my = Boy::new;

		Boy b1 = my.getBoy(22, "robin", 23.4);

		log.info(" name is " + b1.name);

	}// main end

}// class end
