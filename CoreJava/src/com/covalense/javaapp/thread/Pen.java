package com.covalense.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class Pen extends Thread {
@Override
	public void run() {
		String s=getName();
		log.info(""+s);
		for( int i=0;i<5;i++)
		{
			log.info(""+s+i);
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				log.severe(""+e);
			}
		}//end of for loop
		
	}//end of run method
}//end of class
