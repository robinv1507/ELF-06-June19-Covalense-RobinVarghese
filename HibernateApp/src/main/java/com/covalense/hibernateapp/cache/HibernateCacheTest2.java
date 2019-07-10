package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import lombok.extern.java.Log;

@Log
/*
 * 2nd level Hiberante Cache working demo 
 */
public class HibernateCacheTest2 {

	public static void main(String[] args) {

		log.info("1st Time" + getEmpployeeData(1).toString());
		log.info("2st Time" + getEmpployeeData(1).toString());
		log.info("3st Time" + getEmpployeeData(1).toString());
	}// end of main

	public static EmployeeNewInfoBean getEmpployeeData(int id) {

		EmployeeNewInfoBean bean;

		try (Session session = HibernateCacheUtil.openSession();) {

			bean = session.get(EmployeeNewInfoBean.class, id);
		}

		return bean;

	}//

}// end of class
