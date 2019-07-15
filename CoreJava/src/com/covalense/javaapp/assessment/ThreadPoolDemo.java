package com.covalense.javaapp.assessment;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 
 * 26)WAP to print the numbers from 1 to 10 using
 *  5 threads, with the thread pool size of 2.
 */
public class ThreadPoolDemo {

	public static void main(String[] args) {

		ThreadPool p1 = new ThreadPool("ONE");
		ThreadPool p2 = new ThreadPool("TWO");
		ThreadPool p3 = new ThreadPool("THREE");
		ThreadPool p4 = new ThreadPool("FOUR");
		ThreadPool p5 = new ThreadPool("FIVE");


		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(p1);
		service.execute(p2);
		service.execute(p3);
		service.execute(p4);
		service.execute(p5);

		service.shutdown();
	}//end of main
}//end of class
