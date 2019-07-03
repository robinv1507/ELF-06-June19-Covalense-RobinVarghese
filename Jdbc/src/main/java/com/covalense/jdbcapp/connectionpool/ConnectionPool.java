package com.covalense.jdbcapp.connectionpool;

import java.sql.Connection;
import java.sql.DriverManager;

import java.util.Vector;//for thread safe

import static com.covalense.jdbcapp.connectionpool.ConnectionPoolConstants.*;

public class ConnectionPool {

	private Vector<Connection> pool = null;
	
	private static ConnectionPool poolref = null;

	private String password;
	private String userName;
	private int poolSize;
	private String dbUrl;

	private String driverClassNM;

	private ConnectionPool() throws Exception {
		loadProperties();
		initializePool();
		

	}// end of constructor

	// getConnectionFromPool() will return connection object in arraylistpool
	public Connection getConnectionFromPool() {

		return pool.remove(0);

	}// end of getConnectionFromPool()

	public void returnConnectionPool(Connection con) {

		pool.add(con);

	}// end of returnConnectionPool()

	// initializePool()
	private void initializePool() throws Exception {
		pool = new Vector<>();
		 Connection con=null;
		Class.forName(driverClassNM);

		for (int i = 0; i < poolSize; i++) {

			con = DriverManager.getConnection(dbUrl, userName, password);
			pool.add(con);
		} // end of for loop

	}// end of initializePool()

	// loadProperties method
	private void loadProperties() throws Exception {

		// reading the data from ConnectionPool.properties file

		poolSize = Integer.parseInt(PropertyUtil.getPropertyUtil().getProperty(POOL_SIZE));
		userName = PropertyUtil.getPropertyUtil().getProperty(USERNAME);
		password = PropertyUtil.getPropertyUtil().getProperty(PASSWORD);
		dbUrl = PropertyUtil.getPropertyUtil().getProperty(DB_URL);
		driverClassNM = PropertyUtil.getPropertyUtil().getProperty(DRIVERCLASS);

	}// end of loadProperties()

	public static ConnectionPool getConnectionPool() throws Exception {

		if (poolref == null) {
			poolref = new ConnectionPool();
		}

		return poolref;

	}// end of getConnectionPool()

}// end of class
