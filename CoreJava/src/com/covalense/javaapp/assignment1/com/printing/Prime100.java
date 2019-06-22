package com.printing;

public class Prime100 {// class start

	public static void printPrime(int num) {// method start
		int count = 0;

		for (int i = 2; i <= num; i++) {// for loop start
			count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i + "\n");
			}
		} // for loop end
	}// static method end

	public static void main(String[] args) {// main start
		int num = 100;
		printPrime(num);

	}// main end

}// class end
