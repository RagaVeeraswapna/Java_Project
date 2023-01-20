package com.revature.dao.impl;

import java.util.Scanner;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.config.*;
import com.revature.constants.Constants;
import com.revature.dao.RestockDao;

public class Restock extends Thread implements RestockDao {
	private static final Logger logger = Logger.getLogger(Restock.class);
	Connection con = null;
	Statement stm = null;
	ResultSet res = null;
	Scanner sc = new Scanner(System.in);

	public void run() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			// logger.info("Driver Loaded");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306" + "/kbms_project", "root", "Veera@441");
			// logger.info("Connection Established");
			try {
				con = DatabaseConnection.getConnection();
				// logger.info("Connection Established");
				String showQuery = Constants.SHOW_QUERY;
				stm = con.createStatement();
				res = stm.executeQuery(showQuery);
				while (res.next()) {

					if (res.getInt("product_count") < res.getInt("threshold_level")) {
						logger.info("product Id is : " + res.getInt("product_id"));
						logger.info("product name is  : " + res.getString("product_name") + " restock needed");
						logger.info("stock available is  : " + res.getInt("product_count"));
						logger.info("threshold level of the product is : " + res.getInt("Threshold_level"));
						// logger.info("stock initial is : " + res.getInt("total_stock"));
						int a = res.getInt("product_count");
						a = res.getInt("product_count") + 10;
						
						PreparedStatement ps = con.prepareStatement(Constants.UPDATE_QUERY);

						ps.setInt(1, a);
						ps.setInt(2, res.getInt("product_id"));
						int n = ps.executeUpdate();
						logger.info(n);
						logger.info("***********");
					}
				}

			} catch (SQLException e) {
				logger.error(e.getMessage());
			}
		} catch (ClassNotFoundException | SQLException e) {
			logger.error(e.getMessage());
		}
		try

		{
			con.close();
		} catch (SQLException e) {
		}
	}
}
