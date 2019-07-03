package com.covalense.jdbcapp;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;
@Log
/*
 * program to demonstrating the jdbc connectivity
 */
 public class PreparedExampleThree {

	public static void main(String[] args) {

		
		Connection con=null;
		PreparedStatement pstmt=null;
		int rs;
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
						+ " values(?,?,?,?)";	
			
	
			 pstmt=con.prepareStatement(qry);
			
		     pstmt.setInt(1, Integer.parseInt(args[0]));
		     pstmt.setString(2,args[1]);
		     pstmt.setInt(3, Integer.parseInt(args[2]) );
		     pstmt.setInt(4, Integer.parseInt(args[3]) );
		     rs=pstmt.executeUpdate();
		     
		     //printing the result
		     log.info("result is  "+rs);
		    	
		
		
		} catch (SQLException e) {

			log.info(""+e);
		}finally {
			//5.close all "jdbc objects"
			try {
				
				  if(con!=null) {
					  con.close();
				  }
				  if(pstmt!=null) {
					  pstmt.close();
				  }
	
				
			} catch (Exception e2) {

				log.info(""+e2);
			}
			
			
		}//finally block end
		
		
		
		
	}//end of main

}//end of class
