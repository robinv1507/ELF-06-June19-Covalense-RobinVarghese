package com.covalense.javaapp.classcalling;

import lombok.extern.java.Log;

@Log

class Bmi {
	double weight;
	double height;

	double calcBmi(double w, double h) {
		return w / (h * h);
	}

	void result(double res) {
		if (res <= 18.5) {
			log.info("under wieght");
		} else if (res <= 24.9) {
			log.info("normal weight");
		} else if (res <= 29.9) {
			log.info("over wieght");
		} else {
			log.info("obese");
		}

	}// end result()
}// end Bmi class

public class Test2 {

	public static void main(String[] args) {
		Bmi b = new Bmi();

		b.weight = 20;
		b.height = 1.3;
		double r = b.calcBmi(b.weight, b.height);

		b.result(r);

	}// end main

}// end class
