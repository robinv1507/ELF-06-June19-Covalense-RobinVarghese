package com.covalense.javaapp.methodreferenceoperator;

import lombok.extern.java.Log;

@Log
/*
 * method reference operator(::) demo
 * calculating average of marks
 * 
 */
public class AvgMain {
	public static void main(String[] args) {
		
		MyStudent my=new MyStudent();
		Average a=my :: calcAverage;
		double r=a.avg(12,22, 22);
		log.info("average ="+r);
		
	}//main end

}//class end
