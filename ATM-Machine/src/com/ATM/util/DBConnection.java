package com.ATM.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.DriverManager;
//import java.sql.SQLException;

public class DBConnection {
	
	public static Connection getConnection() {
		
		//Step 1 : Loading the driver class
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Could not find the specified class : "+e);
		}
		
		// We can also load the driver class using the commented code below
		// Only restriction to use code from below is that we can use only specified driver only
		
//		try {
//			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//		} catch (SQLException e) {
//			System.out.println("Could not find the specified class : "+e);
//		}
		
		String username = "root";
		String password = "12345";
		String dbUrl = "jdbc:mysql://localhost:3306/atm";

		// Step 2 : Accessing our database
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(dbUrl, username, password);
		} catch (SQLException e) {
			System.out.println("Could not establish the databse connection : "+e);
		}
		
		return connection;
	}
}
