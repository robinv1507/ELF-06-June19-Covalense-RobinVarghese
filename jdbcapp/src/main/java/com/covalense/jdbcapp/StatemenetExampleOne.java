package com.covalense.jdbcapp;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;
@Log
/*
 * program to demonstrating the jdbc connectivity
 */
 public class StatemenetExampleOne {

	public static void main(String[] args) {

		
		Connection con=null;
		Statement stmt=null;
		int result;
		try {
			
			//1. load the driver
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			// or
             //  Class.forName("com.mysql.jdbc.Driver").newInstance();
            
		    //2.get the db connection via driver
			
			String dbUrl="jdbc:mysql://localhost:3306/covalense_db?user=root&password=root";
			 con=DriverManager.getConnection(dbUrl);
			 
			 log.info("connection impl class ==="+con.getClass());
			
			
			//3 issue "sql queries "via "connectiion"
			
			String qry="insert into  employee_info(ID,NAME,DEPPT_ID,MANAGER_ID)"
					+ " values(19,'ramith',10,213)";
			
	
			 stmt=con.createStatement();
			
		        result=stmt.executeUpdate(qry);
		       
		        // printing updated result
		        log.info("udate query value ="+result);
		
		
		} catch (SQLException e) {

			log.info(""+e);
		}finally {
			//5.close all "jdbc objects"
			try {
				
				  if(con!=null) {
					  con.close();
				  }
				  if(stmt!=null) {
					  stmt.close();
				  }
	
				
			} catch (Exception e2) {

				log.info(""+e2);
			}
			
			
		}//finally block end
		
		
		
		
	}//end of main

}//end of class
