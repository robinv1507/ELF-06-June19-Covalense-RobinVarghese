package com.covalense.javaapp.filehandling;

import java.io.File;

import lombok.extern.java.Log;

@Log
public class TestF {

	public static void main(String[] args) {
		File f=new File("movies/english/new");
		boolean res=f.mkdirs();
		log.info(""+"result is: "+res);
		log.info(""+"done");
	}//end main
}//end class
