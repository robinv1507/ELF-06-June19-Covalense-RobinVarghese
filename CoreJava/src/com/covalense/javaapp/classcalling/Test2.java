package com.covalense.javaapp.classcalling;

class Bmi {
	double weight;
	double height;

	double calcBmi(double w, double h) {
		double res = w / (h * h);
		return res;
	}

	void result(double res) {
		if (res <= 18.5) {
			System.out.println("under wieght");
		} else if (res <= 24.9) {
			System.out.println("normal weight");
		} else if (res <= 29.9) {
			System.out.println("over wieght");
		} else {
			System.out.println("obese");
		}

	}
}

public class Test2 {

	public static void main(String[] args) {
		Bmi b = new Bmi();

		b.weight = 20;
		b.height = 1.3;
		double r = b.calcBmi(b.weight, b.height);

		b.result(r);

	}

}
