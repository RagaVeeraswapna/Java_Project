package com.revature.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicConnectionSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// _1_Add pom.xml jar dependency
		_2_loadDriver();
		Connection connection = _3_GetDbConnection();
		// Statements allow to issue SQL queries to the database
		Statement statement = null;
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Result set get the result of the SQL query
		ResultSet resultSet = null;
		try {
			resultSet = statement.executeQuery(" SELECT `name`,`email` FROM `kbms_project`.`user` ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ResultSet is initially before the first data set
		try {
			while (resultSet.next()) {
				// It is possible to get the columns via name
				// also possible to get the columns via the column number
				// which starts at 1
				// e.g. resultSet.getSTring(2);
				String name = resultSet.getString("name");
				String email = resultSet.getString("email");

				System.out.println("name: " + name);
				System.out.println("email: " + email);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static Connection _3_GetDbConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306" + "/kbms_project", "root", "Veera@441");

			if (conn != null) {
				System.out.println("Connected to the database!");
			} else {
				System.out.println("Failed to make connection!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	private static void _2_loadDriver() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}