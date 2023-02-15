package com.revature.service.impl;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.revature.config.ConnectionFactory;
import com.revature.config.DatabaseConnection;

import com.revature.model.User;

public class Login {
	public static boolean login(String username , String password) throws SQLException {
		Connection con =ConnectionFactory.getConnection();
		Statement stmt = con.createStatement();
		String sql="SELECT * FROM customer where ROLE = 'admin'";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
			if(username.equals(rs.getString(1))&& password.equals(rs.getString(7))) {
				return true;
			}
		return false;
	}

	public User getUserForTest(User uu) {
		// TODO Auto-generated method stub

		Connection con = null;
		con = DatabaseConnection.getConnection();

		try {

			java.sql.Statement stm = con.createStatement();

			ResultSet rs = stm.executeQuery("select * from customer");

			while (rs.next()) {

				if (uu.getName().equals(rs.getString(1)) && uu.getPassword().equals(rs.getString(7))) {

					uu.setName(rs.getString(1));

					uu.setPassword(rs.getString(7));

					uu.setRole(rs.getString(3));
				}

			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

		return uu;

	}

}
