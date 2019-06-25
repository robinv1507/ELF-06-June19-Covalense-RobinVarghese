package com.covalense.javaapp.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import lombok.extern.java.Log;
@Log
/*
 * thread using- callable interface demo
 */
public class CollableDemo {
	public static void main(String[] args) {
		
		Pencil p=new Pencil();
		
		FutureTask<Integer> ft=new FutureTask<Integer>(p);
		
		Thread t1=new Thread(ft);
		t1.start();
		
		try {
			int i=ft.get();
			log.info("value is "+i);
		} catch (InterruptedException e) {
			log.severe(""+e);
		} catch (ExecutionException e) {
			log.severe(""+e);		}
		
		
	}//end of main

}//end of class
