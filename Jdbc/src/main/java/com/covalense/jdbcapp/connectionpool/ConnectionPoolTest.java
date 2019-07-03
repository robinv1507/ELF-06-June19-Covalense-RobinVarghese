package com.covalense.jdbcapp.connectionpool;

import java.sql.Connection;


import java.sql.ResultSet;
import java.sql.Statement;

import lombok.extern.java.Log;
@Log
/*
 * program to demonstrating the jdbc connectivity by connection pool concept
 */
 public class ConnectionPoolTest {

	public static void main(String[] args) {

		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		 ConnectionPool pool=null;
		try {
			
			  pool= ConnectionPool.getConnectionPool();
			 con=pool.getConnectionFromPool();
		 
			 log.info("connection impl class ==="+con.getClass());
			
			
			// issue "sql queries "via "connectiion"
			
			String qry="select * from employee_info";
			 stmt=con.createStatement();
			
		        rs=stmt.executeQuery(qry);
			
			//"process the Results" returned by "sql queries"
			while(rs.next()) {
				
				
				log.info(" ID       		===>  "+rs.getInt("ID"));
				log.info(" NAME    	        ===>  "+rs.getString("NAME"));
				log.info(" AGE    			===>  "+rs.getInt("AGE"));
				log.info(" GENDER 			===>  "+rs.getString("GENDER"));
				log.info(" SALARY   		===>  "+rs.getDouble("SALARY"));
				log.info(" PHONE    		===>  "+rs.getLong("PHONE"));
				log.info(" JOINING_DATE		===>  "+rs.getDate("JOINING_DATE"));
				log.info(" ACCOUNT_NO  		===>  "+rs.getInt("ACCOUNT_NO"));
				log.info(" EMAIL      		===>  "+rs.getString("EMAIL"));
				log.info(" DESIGNATION 		===>  "+rs.getString("DESIGNATION"));
				log.info(" DOB         		===>  "+rs.getDate("DOB"));
				log.info(" DEPT_ID  		===>  "+rs.getInt("DEPPT_ID"));
				log.info(" (MANAGER_ID)		===>  "+rs.getInt("MANAGER_ID"));
		
				
			}//end of while

		} catch (Exception e) {

			e.printStackTrace();
		}finally {
			//.close all "jdbc objects"
			try {
				
				if(pool!=null) {
					 pool.returnConnectionPool(con);
				  }
				   
				  if(stmt!=null) {
					  stmt.close();
				  }
				  if(rs!=null) {
					  rs.close();
				  }
	
				
			} catch (Exception e2) {

				e2.printStackTrace();
			}
			
		}//end of finally block
		
		
	}//end of main

}//end of class
