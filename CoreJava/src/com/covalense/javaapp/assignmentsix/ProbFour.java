package com.covalense.javaapp.assignmentsix;

import lombok.extern.java.Log;

@Log
/*
 * lamda exp for square of a number
 */
public class ProbFour {
	public static void main(String[] args) {
		Square sq = a -> a * a;
		int result = sq.squareofnum(6);
		log.info("" + result);
	}// main end

}// class end
