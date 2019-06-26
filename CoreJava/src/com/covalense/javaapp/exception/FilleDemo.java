package com.covalense.javaapp.exception;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import lombok.extern.java.Log;
@Log
/*
 * new feature try block 
 */
public class FilleDemo {

	public static void main(String[] args) {

		String s="hi welcome ";
		byte[] by=s.getBytes();
		
		try(FileOutputStream fout=new FileOutputStream("file11.txt")) {
			
			fout.write(by);
		} catch (FileNotFoundException e) {
              log.info(e.getMessage());
		} catch (IOException e) {
			  log.info(e.getMessage());
		}
		
		
	}//main end

}//class end
