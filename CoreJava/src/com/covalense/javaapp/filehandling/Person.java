package com.covalense.javaapp.filehandling;

import java.io.Serializable;

import lombok.Data;
@Data
/*
 * bean class
 */
public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int id;
	

}//end of class
