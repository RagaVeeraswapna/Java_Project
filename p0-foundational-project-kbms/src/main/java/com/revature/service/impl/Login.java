package com.revature.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.revature.config.DatabaseConnection;
import com.revature.model.RestockApplication;

public class Login {
	 
	public static void login() throws SQLException {
		Connection con = DatabaseConnection.getConnection();
		RestockApplication m= new RestockApplication();
		Statement stmt = con.createStatement();
		// Get input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Username: ");
		String username = sc.nextLine();
		System.out.print("Password: ");
		String password = sc.nextLine();

		try {

			// Execute a query
			System.out.println("Checking credentials...");

			String sql;
			sql = "SELECT * FROM customer WHERE customer_name = '" + username + "' AND password = '" + password + "'";
			ResultSet rs = stmt.executeQuery(sql);
			
			// Extract data from result set
			
			if (rs.next()) {
				// Retrieve by column name
				String customerName = rs.getString("customer_name");
				String customerPassword = rs.getString("password");

				// Display values
				System.out.println("Welcome, " + customerName + "!");
				m.menu();
			} else {
				System.out.println("Invalid username or password.");
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
