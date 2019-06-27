package com.covalense.javaapp.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
 * thread pool - executor service demo
 */
public class TestMouse {
	public static void main(String[] args) {
		
		Mouse m1=new Mouse("MYFirst");
		Mouse m2=new Mouse("MYSecond");
		Mouse m3=new Mouse("MYthird");
		/*
		 * thread pool size giving 2 but,
		 *  it can hold how many  you are giving
		 */
		
		ExecutorService service=Executors.newFixedThreadPool(2);
		service.execute(m1);
		service.execute(m2);
		service.execute(m3);
		
		service.shutdown();
		
	}//main end
}//class end
