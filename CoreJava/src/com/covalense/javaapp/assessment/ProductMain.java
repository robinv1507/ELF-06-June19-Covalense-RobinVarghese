package com.covalense.javaapp.assessment;

import java.util.ArrayList;

import java.util.List;

import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
/*
 * WAP to display the list of products ,
 * by type or by the given range. (Using Lambda and Stream)
 */

public class ProductMain {
	public static void main(String[] args) {
		
		Product p1=new Product(01,"tv","lg",123355);
		Product p2=new Product(02,"phone","redmi note2",13355);
		
		ArrayList<Product> a=new ArrayList<>();
		a.add(p1);
		a.add(p2);
		
		String productType="tv";
		
	  List<Product> newList=a.stream().filter(i->i.ptype.equals(productType)).collect(Collectors.toList());
	  
	  
       //displaying product based on p type
        for(Product p : newList)
        {
        	log.info(" product name ="+p.name);
        	log.info(" product type ="+p.ptype);
        	log.info(" product cost ="+p.cost);
        	
        }
			
				
		
		
	}//end of main

}//end of class
