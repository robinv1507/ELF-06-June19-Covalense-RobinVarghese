package com.covalense.javaapp.lamda;
import java.util.function.Supplier;

import lombok.extern.java.Log;
@Log
/*
 * Supplier interface using lambda
 */
public class Shop {
	public static void main(String[] args) {
		
		Supplier<Gun> c=()->new Gun(100);
		
		Gun s=c.get();
		log.info(""+s.bullet);
		
		
	}//main end

}//class end
