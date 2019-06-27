package com.covalense.javaapp.lamda;

import java.util.function.Predicate;

import lombok.extern.java.Log;
@Log
/**
 * odd array element printing using ,
 * predicated Lambda expression
 *
 *
 */
public class PredicatedEvenNumber {

	public static void main(String[] args) {
		
		int[] b= {2,5,9,6,8};
		Predicate<Integer> p=a->a%2!=0;
		for(int i=0;i<b.length;i++)
		{
		    
		    if(p.test(b[i]))
		    {
		    	log.info(""+b[i]);
		    }
		}//end for loop
		
	}//end main
}//end class
