package com.covalense.hibernateassessment.customer;

import com.covalense.hibernateassessment.dao.CustomerDao;
import com.covalense.hibernateassessment.dto.CustomerBean;

import lombok.extern.java.Log;

/*
 *     
*Question 1. 
*Table Name - customer
*updating the records to Customer table
*
 */
@Log
public class CustomerUpdateRecord {

	public static void main(String[] args) {

		CustomerBean customerBean = new CustomerBean();
		// setting the value to bean
		customerBean.setAddress("#ih ram nagar");
		customerBean.setCity("bangalore");
		customerBean.setContactNumber(456456456);
		customerBean.setId(01);
		customerBean.setCountry("india");
		customerBean.setFname("vishal");
		customerBean.setLname("gupta");
		customerBean.setState("karnatka");
		// passing the bean to dao
		CustomerDao dao = new CustomerDao();
		if (dao.insertRecord(customerBean)) {
			log.info("record updated successfully");
		} else {
			log.info("failed to update");
		}

	}// end of main

}// end of class
