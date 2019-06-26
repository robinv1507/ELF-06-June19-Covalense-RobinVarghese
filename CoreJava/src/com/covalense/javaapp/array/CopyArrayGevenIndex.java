package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log

public class CopyArrayGevenIndex {
	public static void main(String[] args) {
		int a[] = { 5, 9, 3, 6, 4 };
		int b[] = { 30, 40, 50, 60 };

		System.arraycopy(a, 1, b, 1, 2);

		for (int n : b) {
			log.info("" + n);
		}

	}

}
