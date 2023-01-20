package com.revature.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.config.DatabaseConnection;

import com.revature.model.RestockApplication;

public class Login {
	private static final Logger logger = Logger.getLogger(Login.class);
	public static void login() throws SQLException {
		Connection con = DatabaseConnection.getConnection();
		//RestockApplication m= new RestockApplication();
		Statement stmt = con.createStatement();
		// Get input from user
		logger.info("**********please login**********");
		Scanner sc = new Scanner(System.in);
		System.out.print("Username: ");
		String username = sc.nextLine();
		System.out.print("Password: ");
		String password = sc.nextLine();

		try {

			// Execute a query
			logger.info("Checking credentials...");

			String sql;
			sql = "SELECT * FROM customer WHERE customer_name = '" + username + "' AND password = '" + password + "'";
			ResultSet rs = stmt.executeQuery(sql);
			
			// Extract data from result set
			
			if (rs.next()) {
				// Retrieve by column name
				String customerName = rs.getString("customer_name");
				String customerPassword = rs.getString("password");
				logger.info("\n*****Welcome to Kitchen Basket Management System******");
				// Display values
				logger.info("Welcome, " + customerName + "!");
				RestockApplication.menu();
			} else {
				logger.info("Invalid username or password.");
			}
			// Clean-up environment
			rs.close();
			stmt.close();
//			con.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
				
			} // nothing we can do
		
		} // end try
	}
}
