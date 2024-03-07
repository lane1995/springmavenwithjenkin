package com.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class SimpleControllerTest {
	
	@Autowired
	SimpleController simpleController;
	@Test
	void testSayHello() {
		//fail("Not yet implemented");
		String result = simpleController.sayHello();
		assertEquals("Welcome to spring rest api",result);
	}

}
