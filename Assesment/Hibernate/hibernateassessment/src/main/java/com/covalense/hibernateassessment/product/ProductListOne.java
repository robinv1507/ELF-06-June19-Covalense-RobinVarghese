package com.covalense.hibernateassessment.product;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.covalense.hibernateassessment.dto.ProductBean;
import com.covalense.hibernateassessment.sessionfactory.HibernateUtil;

import lombok.extern.java.Log;
@Log
/*
*Question 2.
*condition 1: Get a list of Products, which has a price less than 100.
 */
public class ProductListOne {

	public static void main(String[] args) {

		try (Session session = HibernateUtil.openSession()) {

			Criteria criteria = session.createCriteria(ProductBean.class);
			Criterion criterion = Restrictions.le("price", 100);
			criteria.add(criterion);
			//Get a list of Products which has a price less than 100.
			List<ProductBean> beans=criteria.list();
			//printing
			for(ProductBean bean: beans) {
				log.info("name" +bean.getName());
			}

		}
	}// end of main

}// end of class
