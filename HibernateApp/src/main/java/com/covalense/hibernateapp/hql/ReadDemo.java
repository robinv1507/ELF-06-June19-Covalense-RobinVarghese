package com.covalense.hibernateapp.hql;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
/*
 * HibernateQueryLanguage(HQL) query operations demo
 */
public class ReadDemo {

	public static void main(String[] args) {

		Session session = HibernateUtil.openSession();

		String hql = "from EmployeeInfoBean";

		Query query = session.createQuery(hql);
		List<EmployeeInfoBean> employeeBeanList = query.list();

		for (EmployeeInfoBean bean : employeeBeanList) {
			log.info("Id =>" + bean.getId());
			log.info("name =>" + bean.getName());
			log.info("phone =>" + bean.getPhone());
			log.info("email=>" + bean.getEmail());
			log.info("gender=>" + bean.getGender());
			log.info("Designation =>" + bean.getDesignation());
			log.info("Salary =>" + bean.getSalary());
		}

		session.close();
		
	}// end of main

}// end of class
