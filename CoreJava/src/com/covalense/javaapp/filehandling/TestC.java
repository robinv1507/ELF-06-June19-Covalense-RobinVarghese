package com.covalense.javaapp.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import lombok.extern.java.Log;

@Log
public class TestC {

	public static void main(String[] args) {
		String msg = "Humpy Dumpy had a great fall";
		byte[]  b= msg.getBytes();
		try {
			FileOutputStream fout = new FileOutputStream("poem.txt", true);
			fout.write(b);
			fout.close();

		} catch (FileNotFoundException e) {
			log.info("FileNotFoundException");

		} catch (IOException e) {
			log.info("IOException");
		}
	}//end main

}//end class
