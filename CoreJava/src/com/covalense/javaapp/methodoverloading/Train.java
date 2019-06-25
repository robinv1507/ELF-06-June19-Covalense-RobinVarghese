package com.covalense.javaapp.methodoverloading;

public class Train {

	static void search(int id) {
		System.out.println("searching by train number ");

	}

	void search(String name) {
		System.out.println("searching by name");
	}

	public static void main(String[] args) {

		// Train t=new Train();
		search(1212);
		// t.search("h");
	}

}
