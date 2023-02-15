package com.revature.model;

import com.revature.dao.impl.RestockDaoImpl;
import com.revature.service.impl.Login;

import java.sql.SQLException;
import java.util.Scanner;

public class RestockApplication {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			//Login a=new Login();
			try {
				Login.login(sc.nextLine(), sc.nextLine());
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			//boolean b=Login.login("Alexa", "xxxxxxx");
			//System.out.println(b);
		}
		
	}
	public static void menu() {
		RestockDaoImpl r1=new RestockDaoImpl();
		RestockDaoImpl r2=new RestockDaoImpl();
			r1.start();
			r2.start();
			try {
				Thread.sleep(5000);
				System.out.println("***************");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	}
}