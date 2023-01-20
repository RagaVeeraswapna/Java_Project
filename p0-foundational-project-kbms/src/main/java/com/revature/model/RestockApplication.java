package com.revature.model;

import com.revature.dao.impl.Restock;

public class RestockApplication {
	public static void main(String[] args) {
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