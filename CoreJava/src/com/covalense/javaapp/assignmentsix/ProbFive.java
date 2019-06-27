package com.covalense.javaapp.assignmentsix;

import lombok.extern.java.Log;

@Log
/*
 * lamda exp for printing numbers ,
 * in a given range
 */
public class ProbFive  {

	public static void main(String[] args) {

		PrintNum p = (a, b) -> {
			for (int i = a; i < b; i++) {
				log.info("" + i);
			}
			return b;

		};//lamda exp end
		int result = p.num(5, 20);
		log.info("" + result);
	}// main end

}// class end
