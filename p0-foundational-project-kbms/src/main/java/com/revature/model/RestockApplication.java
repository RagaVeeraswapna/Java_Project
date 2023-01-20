package com.revature.model;

import java.sql.SQLException;

import com.revature.dao.impl.RestockDaoImpl;
import com.revature.service.impl.Login;

public class RestockApplication {
	public static void main(String[] args) throws SQLException {
		//Login a=new Login();
		Login.login();
		
	}

	public static void menu() {
		RestockDaoImpl r1=new RestockDaoImpl();
			r1.start();
			try {
				Thread.sleep(5000);
				System.out.println("***************");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	}
}