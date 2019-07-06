package com.covalense.designpatterns.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.designpatterns.beans.EmployeeInfoBean;

public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		
		return null;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(EmployeeInfoBean.class);
		SessionFactory factory=configuration.buildSessionFactory();
		
		Session session=factory.openSession();
		EmployeeInfoBean bean=session.get(EmployeeInfoBean.class,id);
		session.close();
		
		return bean;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		

		return getEmployeeInfo(Integer.parseInt(id));
	}

	@Override
	public boolean CreateEmployeeinfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeinfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeinfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeinfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
	
}
