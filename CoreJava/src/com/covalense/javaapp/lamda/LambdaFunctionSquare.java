package com.covalense.javaapp.lamda;

import java.util.function.Function;

import lombok.extern.java.Log;
@Log
/*
 * square of a number using lambda-function  
 */
public class LambdaFunctionSquare {
	public static void main(String[] args) {
		

		Function<Double, Double> f = r ->  r * r;

		double x = f.apply(3.2);

		log.info(""+x);
	}//main end

}//class end
