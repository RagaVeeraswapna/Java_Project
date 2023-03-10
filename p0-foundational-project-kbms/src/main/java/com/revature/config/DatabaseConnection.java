package com.revature.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DatabaseConnection {
	private static Connection connection = null;

	public DatabaseConnection() {
	}

	public static Connection getConnection() {
		if (connection == null) {
			ResourceBundle resourceBundle = ResourceBundle.getBundle("my");
			String driver = resourceBundle.getString("driver");
			String dburl = resourceBundle.getString("dburl");
			String username = resourceBundle.getString("username");
			String password = resourceBundle.getString("password");

			try {
				Class.forName(driver);
				connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306"+"/kbms_project","root","Veera@441");
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
}
