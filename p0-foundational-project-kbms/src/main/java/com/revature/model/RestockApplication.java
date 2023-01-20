package com.revature.model;

import java.sql.SQLException;

import com.revature.dao.impl.Restock;
import com.revature.service.impl.Login;

public class RestockApplication {
	public static void main(String[] args) throws SQLException {
		Login a=new Login();
		a.login();
		
	}

	public static void menu() {
		Restock r1=new Restock();
			r1.start();
			try {
				Thread.sleep(5000);
				System.out.println("***************");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	}
}