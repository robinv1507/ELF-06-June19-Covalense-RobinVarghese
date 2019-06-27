package com.covalense.javaapp.lamda;


import java.util.function.Function;

import lombok.extern.java.Log;

@Log
/*
 * area of a circle using lambda-function
 */

public class LambdaFunction {

	public static void main(String[] args) {
		

		Function<Double, Double> f = r -> 3.14 * r * r;

		double x = f.apply(3.4);

		log.info(""+x);

	}//main end

}//end class
