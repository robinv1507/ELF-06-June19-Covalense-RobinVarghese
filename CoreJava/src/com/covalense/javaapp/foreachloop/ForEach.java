package com.covalense.javaapp.foreachloop;

public class ForEach {

	public static void main(String[] args) {

		int[] a = { 1, 3, 9, 7 };
		double[] d = { 1.2, 2.3, 3.6 };

		for (int f : a) {
			System.out.println(f);
		}
		for (double v : d) {
			System.out.println(v);
		}
		
	}

}
