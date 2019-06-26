package com.covalense.javaapp.methodoverloading;

public class Girl {
	
	void recieve(Phone p)
	{

         if(p instanceof Iphone)
         {
        	 System.out.println("i love you");
         }
         else if(p instanceof Miphone)
         {
        	 System.out.println("Thank you brother");
         }
		
	}

}
