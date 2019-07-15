package com.covalense.javaapp.assessment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import lombok.extern.java.Log;
@Log
/*
 * 3)/	WAP for a method which returns ArrayList,
 *  LinkedList, Vector… based on the option entered
 */
public class ListGeneratorTest {
	
	public static void main(String[] args) {
		
         List<Integer> list = getList("vector");
		
		log.info(list.getClass().toString());
		
	}//end of main
	
	//getList() for returning list
   private static List<Integer> getList(String type) {
		
		List<Integer> list = null;
		if(type.equalsIgnoreCase("arraylist")) {
			list = new ArrayList<Integer>();
		}else if(type.equalsIgnoreCase("vector")) {
			list = new Vector<Integer>();
		}else if(type.equalsIgnoreCase("linkedlist")) {
			list = new LinkedList<Integer>();
		}
		return list;
	}//end of getList()
	
}//end of class

