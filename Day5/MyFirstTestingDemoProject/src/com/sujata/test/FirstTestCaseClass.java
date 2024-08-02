package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstTestCaseClass {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Hi I am setUpBeforeClass");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Hi I am tearDownAfterClass");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("======================");
		System.out.println("Hi I am setUp");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Hi I am tearDown");
		System.out.println("**********************");
	}

	@Test
	void testDivide1() {
		System.out.println("Hi I am First Test Case");
	}
	
	@Test
	void testDivide2() {
		System.out.println("Hi I am Second Test Case");
	}
	
	@Test
	void testDivide3() {
		System.out.println("Hi I am Third Test Case");
	}

}
