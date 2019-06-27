package com.covalense.javaapp.filehandling;

import java.io.Serializable;

import lombok.Data;
@Data
/*
 * bean class
 */
@SuppressWarnings("serial")
public class Person implements Serializable {
	private String name;
	private int id;
	

}//end of class
