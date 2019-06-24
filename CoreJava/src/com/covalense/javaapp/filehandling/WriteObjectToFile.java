package com.covalense.javaapp.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import lombok.extern.java.Log;

@Log
/*
 * writing object to the file
 */
public class WriteObjectToFile {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Kavya");
		p.setId(22);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("file1.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
		} catch (IOException e) {
			log.info("io exception");
		} finally {

			try {
				if (oos != null || fos != null) {
					oos.close();
					fos.close();
				}

			} catch (IOException e) {
				log.info("io exception");
			}
		}

	}// end of main

}// end of class
