package com.covalense.hibernateassessment.customer;

import com.covalense.hibernateassessment.dao.CustomerDao;
import lombok.extern.java.Log;

/*
 *     
*Question 1. 
*Table Name - customer
*deleting the records from Customer table
*
 */
@Log
public class CustomerTableDeleteRecord {
	public static void main(String[] args) {
		CustomerDao dao = new CustomerDao();
		int id = 1;
		if (dao.deleteRecord(id)) {
			log.info("record deleted successfully");
		} else {
			log.info("failed to deleting");
		}
	}
}// end of class
