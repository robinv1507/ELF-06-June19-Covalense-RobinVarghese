package com.covalense.javaapp.filehandling;
import java.io.File;
import java.io.IOException;

public class Test1 {
	 public static void main(String[] args) {
	     File f=new File("movies/programfile");
	     boolean res=f.mkdirs();
		
		System.out.println("result is "+res);
}
}
