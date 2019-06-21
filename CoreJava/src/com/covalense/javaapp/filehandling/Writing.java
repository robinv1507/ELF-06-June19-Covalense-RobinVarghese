package com.covalense.javaapp.filehandling;

import java.io.FileNotFoundException;

import java.io.FileWriter;
import java.io.IOException;

public class Writing {
   public static void main(String[] args) {
	   String a="dam dam diga diga";
	   char ch[]=a.toCharArray();
	    try {
			FileWriter fw=new FileWriter("poem.txt");
			fw.write(ch);
			fw.flush();
			fw.close();
			System.out.println("done"); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
}
}
