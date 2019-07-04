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
		
		
		ArrayList<Product> productArrayList=new ArrayList<>();
		
		productArrayList.add(new Product(01,"tv","lg",123355));
		productArrayList.add(new Product(02,"phone","redmi note2",13355));
		productArrayList.add(new Product(03,"phone","redmi note7",15000));
		
		
		//user inputs
		String productType="tv";
		int startRang=12000;
		int endRange=14000;
		
		//filtering based on type of product
	  List<Product> productTpyeList=productArrayList.stream().filter(i->i.ptype.equals(productType)).collect(Collectors.toList());
	  
	  //filtering based on given range of product
	  List<Product> rangeList=productArrayList.stream().filter(i->i.cost>startRang && i.cost<endRange).collect(Collectors.toList());

       //displaying product based on p type
	  log.info("product based on p type");
        for(Product p : productTpyeList)
        {
        	log.info(" product name ="+p.name);
        	log.info(" product type ="+p.ptype);
        	log.info(" product cost ="+p.cost);
        	
        }
        //displaying product based on given range of product
        log.info("product based on given range of product");
        for(Product pt : rangeList)
        {
        	log.info(" product name ="+pt.name);
        	log.info(" product type ="+pt.ptype);
        	log.info(" product cost ="+pt.cost);
        	
        }
				
		
		
	}//end of main

}//end of class
