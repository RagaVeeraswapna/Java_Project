package com.revature.util;

import java.util.function.Predicate;

import com.revature.model.*;

import com.revature.model.User;

public class PredicateInterface {
	public static void main(String[] args) {
		Predicate<User> checkingRole = User->(User.getRole()==("admin"));
		if(checkingRole.test(new User("Alexa","al9090@hmail.com","9894523889", "Street 3, twin tower, Jordan", 
			    "1999-11-10", 23, "visa card", "user","alexa_9090","xxxxxxx123"))) {
			RestockApplication.menu();
		}
		else
			System.out.println("Invalid credentials.....");
	}
}
