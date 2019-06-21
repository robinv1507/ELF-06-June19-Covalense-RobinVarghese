package com.covalense.javaapp.filehandling;
import java.io.File;
import java.io.IOException;

public class FIleHandle {
   public static void main(String[] args) {
	     File f=new File("M:/file.txt");
	     try {
			boolean res=f.createNewFile();
			
			System.out.println("result is "+res);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
