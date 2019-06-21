package com.covalense.javaapp.array;

public class CopyArray {
	public static void main(String[] args) {

		int a[] = { 5, 9, 3, 6, 4 };
		int b[] = { 30, 40, 50, 60 };

		int fromIndex = 2;// given index
		int givenElement = 1;
		int count = 0;

		for (int j = fromIndex; j < b.length; j++) {//for loop begin
			count++;
			b[j] = a[j - fromIndex];

			if (count > givenElement) {//if begin
				break;

			}//if end

		}//for loop end

		for (int n : b) {
			System.out.println(n);
		}

	}

}
