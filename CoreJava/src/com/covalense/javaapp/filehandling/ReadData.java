package com.covalense.javaapp.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadData {
    public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("file.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
