package com.revature.dao.impl.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.revature.dao.impl.RestockDaoImpl;

public class RestockDaoImplTest {
	@Test
	public void test(){
		RestockDaoImpl r=new RestockDaoImpl();
		r.start();
		int x=RestockDaoImpl.count;
		assertEquals(x,RestockDaoImpl.count);
	}
}
