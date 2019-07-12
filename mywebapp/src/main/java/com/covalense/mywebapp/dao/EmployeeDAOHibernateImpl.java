package com.covalense.mywebapp.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.mywebapp.beans.EmployeeDepartmentInfoBean;
import com.covalense.mywebapp.beans.EmployeeInfoBean;
import com.covalense.mywebapp.util.HibernateUtil;

public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Override
	public List<EmployeeInfoBean> getAllEmployeeInfo() {
		Session session = HibernateUtil.openSession();
		String hql = "from EmployeeInfoBean";
		Query query = session.createQuery(hql);
		return query.list();
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		EmployeeInfoBean bean =null;
		
		try(Session session= HibernateUtil.openSession();) {
			
		    bean = session.get(EmployeeInfoBean.class, id);
	    }
		return bean;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {

		return getEmployeeInfo(Integer.parseInt(id));
	}

	private boolean saveOrUpdate(EmployeeDepartmentInfoBean bean) {
		Transaction txn = null;

		try (Session session = HibernateUtil.openSession();){
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
			if(txn!=null) {
				txn.rollback();
			}
			
			return false;
		}
	}
	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;

		try (Session session = HibernateUtil.openSession();){
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
			if(txn!=null) {
				txn.rollback();
			}
			
			return false;
		}
	}

	@Override
	public boolean createEmployeeinfo(EmployeeInfoBean bean) {

		return saveOrUpdate(bean);
	}

	@Override
	public boolean updateEmployeeinfo(EmployeeInfoBean bean) {

		return saveOrUpdate(bean);
	}

	@Override
	public boolean deleteEmployeeinfo(int id) {
		Transaction txn = null;
		EmployeeInfoBean bean =new EmployeeInfoBean();
		bean.setId(id);

		try {
			Session session = HibernateUtil.openSession();
			txn = session.beginTransaction();
			session.delete(bean);
			txn.commit();
			return true;
		}  catch (Exception e) {
			
			e.printStackTrace();
			if(txn!=null) {
				txn.rollback();
			}
			
			return false;
		}

	}

	@Override
	public boolean deleteEmployeeinfo(String id) {

		return deleteEmployeeinfo(Integer.parseInt(id));
	}

	@Override
	public boolean createDepartmentinfo(EmployeeDepartmentInfoBean bean) {
		
		return saveOrUpdate(bean);
	}

}
