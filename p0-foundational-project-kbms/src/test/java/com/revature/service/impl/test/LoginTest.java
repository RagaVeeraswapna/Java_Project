package com.revature.service.impl.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.revature.model.User;
import com.revature.service.impl.Login;

public class LoginTest {
	@Test
	public void authenticationTest() {
		Login login=new Login();
		User u1=new User();
		User u2=new User("Alexa","al9090@hmail.com","9894523889", "Street 3, twin tower, Jordan", 
			    "1999-11-10", 23, "visa card", "user","alexa_9090","xxxxxxx123");
		u1=login.getUserForTest(u2);
		assertEquals(u1.getName(),u2.getName());
	}

}
