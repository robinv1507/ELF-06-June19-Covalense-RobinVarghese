package com.covalense.javaapp.classcalling;

import lombok.extern.java.Log;

@Log

class Phone {
	double price;
	String name;

	void ads() {
		log.info(" welcome to *S S communications*");
	}
}//class Phone end

@Log

public class Test1 {

	public static void main(String[] args) {

		Phone p1 = new Phone();
		p1.price = 15000;
		p1.name = "redmi note 7 pro";

		p1.ads();

		log.info("" + "name is " + p1.name);
		log.info("" + "Price  is " + p1.price);

	}//main end

}//class end
