package com.covalense.javaapp.lamda;

import java.util.function.Supplier;

import lombok.extern.java.Log;
@Log
/*
 * Supplier interface using lambda
 */
public class TestCar {
	public static void main(String[] args) {
		
		Supplier<Car> s=()->new Car(5);
		
		Car c=s.get();
		log.info("defualt car fuel is "+c.fuel);
		
		
	}//main end

}//class end
