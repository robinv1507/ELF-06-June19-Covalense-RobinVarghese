package com.covalense.hibernateassessment.customer;

import com.covalense.hibernateassessment.dao.CustomerDao;
import com.covalense.hibernateassessment.dto.CustomerBean;

import lombok.extern.java.Log;

/*
 *     
*Question 1. 
*Table Name - customer
*reading the records from Customer table
*
 */
@Log
public class CustomerTableReadRecord {
	public static void main(String[] args) {

		CustomerDao dao = new CustomerDao();
		int id = 1;
		CustomerBean customerBean = dao.readRecord(id);
		// printing the beanvalue
		log.info(customerBean.toString());
	}// end of main

}// end of class
