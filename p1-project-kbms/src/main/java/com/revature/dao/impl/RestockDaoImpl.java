package com.revature.dao.impl;

import java.util.Scanner;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.config.*;
import com.revature.constants.Constants;
import com.revature.dao.RestockDao;

public class RestockDaoImpl extends Thread implements RestockDao {
	private static final Logger logger = Logger.getLogger(RestockDaoImpl.class);
	Connection con = null;
	Statement stm = null;
	ResultSet res = null;
	public static int count = 0;
	Scanner sc = new Scanner(System.in);

	public void run() {

			try {
				con = ConnectionFactory.getConnection();
				// logger.info("Connection Established");
				String showQuery = Constants.SHOW_QUERY;
				stm = con.createStatement();
				res = stm.executeQuery(showQuery);
				while (res.next()) {
					count+=1;
					if (res.getInt("product_count") < res.getInt("threshold_level")) {
						//logger.info("product Id is : " + res.getInt("product_id"));
						//logger.info("product name is  : " + res.getString("product_name") + " restock needed");
						//logger.info("stock available is  : " + res.getInt("product_count"));
						//logger.info("threshold level of the product is : " + res.getInt("Threshold_level"));
						// logger.info("stock initial is : " + res.getInt("total_stock"));
						int a = res.getInt("product_count") +1;
						//a = res.getInt("product_count") + 10;
						
						PreparedStatement ps = con.prepareStatement(Constants.UPDATE_QUERY);

						ps.setInt(1, a);
						ps.setInt(2, res.getInt("product_id"));
						int n = ps.executeUpdate();
						//logger.info(n);
						//logger.info("***********");
					}
				}

			} catch (SQLException e) {
				logger.error(e.getMessage());
			}
		
		try

		{
			con.close();
		} catch (SQLException e) {
		}
	}
}
