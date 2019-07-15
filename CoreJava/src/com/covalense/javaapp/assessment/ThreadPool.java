package com.covalense.javaapp.assessment;

import lombok.extern.java.Log;

/**
 * 
 * 
 * WAP to print the numbers from 1 to 10 using
 *  5 threads, with the thread pool size of 2.
 *
 */
@Log
public class ThreadPool implements Runnable{

	String numbers;

	public ThreadPool(String numbers) {
		super();
		this.numbers = numbers;
	}

	@Override
	public void run() {
		try {
			
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				log.info("Pool"+i);
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
