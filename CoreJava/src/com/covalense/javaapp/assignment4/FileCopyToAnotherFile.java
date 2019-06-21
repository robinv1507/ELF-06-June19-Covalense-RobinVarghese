package com.covalense.javaapp.assignment4;

import java.io.File;
import java.io.IOException;

public class FileCopyToAnotherFile {

	public static void main(String[] args) {
		File f1 = new File("file1.txt");

		File f2 = new File("file2.txt");

		try {
			
			f1.createNewFile();//file1 created
			f2.createNewFile();//file2 created
			
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main end

}//class end
