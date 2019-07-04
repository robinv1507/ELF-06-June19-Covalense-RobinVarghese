package com.covalense.javaapp.assessment;

import lombok.extern.java.Log;

@Log
public class SingleTon {
		   
		private static final SingleTon singleTon=new SingleTon();
		
		private SingleTon()
		{
			
		}
		
		
		public static SingleTon getInstance()
		{
			return singleTon;
		}
		void print()
		{
			log.info("hi  iam a print() of SingleTon class");
		}
		
}//end of class



