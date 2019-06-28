package com.covalense.assessment;
/*
 * WAP to search a train by name or number
 */
public class SearchingTrainMain {

	public static void main(String[] args) {

		Train t = new Train();
		// searching the train by name
		t.search("sabari express");

		// searching the train by number
		t.search(12340);

	}// end of main

}// end of class
