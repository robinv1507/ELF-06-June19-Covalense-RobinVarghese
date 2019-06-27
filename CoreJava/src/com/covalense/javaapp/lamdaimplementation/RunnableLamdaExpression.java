package com.covalense.javaapp.lamdaimplementation;

import lombok.extern.java.Log;

@Log
/*
 * lambda expression implementation using Runnable interface 
 */
public class RunnableLamdaExpression {

	public static void main(String[] args) {
		
		//lambda exp 
		Runnable x=()->{
			
			for(int i=1;i<10;i++)
			{
				log.info(""+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					log.info(""+e);
				}
			}
		};
		
		Thread t1=new Thread(x);
		t1.start();

	}//main end

}//class end
