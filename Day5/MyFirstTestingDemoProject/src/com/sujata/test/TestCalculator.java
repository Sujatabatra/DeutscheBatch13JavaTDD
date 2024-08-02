package com.sujata.test;

/*
 * static import : importing all the static members of the specified class, in our case its Assertions class
 * benefit of using static import is that while calling the static members of the specified class(Assertions class) we need not to use class name
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.sujata.demo.Calculator;
import com.sujata.exception.NegativeNumberException;

class TestCalculator {

	private Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
	}

	@Nested
	class TestDivideMethod {
		@Test
		@DisplayName("divide(50,10)")
		void R001_T001() {
			assertEquals(5, calculator.divide(50, 10));
		}

		@Test
		@DisplayName("divide(50,0)")
		void R001_T002() {
			assertThrows(ArithmeticException.class, () -> calculator.divide(50, 0));
		}

		@Test
		@DisplayName("divide(0,50)")
		void R001_T003() {
			assertEquals(0, calculator.divide(0, 50));
		}

		@Test
		@DisplayName("divide(-50,10)")
		void R001_T004() {
			assertThrows(NegativeNumberException.class, () -> calculator.divide(-50, 10));
		}

		@Test
		@DisplayName("divide(50,-10)")
		void R001_T005() {
			assertThrows(NegativeNumberException.class, () -> calculator.divide(50, -10));
		}

		@Test
		@DisplayName("divide(-50,-10)")
		void R001_T006() {
			assertThrows(NegativeNumberException.class, () -> calculator.divide(-50, -10));
		}

		@Test
		@DisplayName("divide(0,-10)")
//	@Disabled
		void R001_T007() {
			assertThrows(NegativeNumberException.class, () -> calculator.divide(0, -10));
		}

		@Test
		@DisplayName("divide(-50,0)")
		void R001_T008() {
			assertThrows(NegativeNumberException.class, () -> calculator.divide(-50, 0));
		}

		@Test
		@DisplayName("divide(0,0)")
		void R001_T009() {
			assertThrows(ArithmeticException.class, () -> calculator.divide(0, 0));
		}

	}

	@Nested
	@DisplayName("test cases for add()")
	class TestAddMethod {
		@Test
		@DisplayName("add(10,20)")
		void R002_T001() {
			assertEquals(30, calculator.add(10, 20));
		}

		@Test
		@DisplayName("add(-10,20)")
		void R002_T002() {
			assertThrows(NegativeNumberException.class, () -> calculator.add(-10, 20));
		}

		@Test
		@DisplayName("add(10,-20)")
		void R002_T003() {
			assertThrows(NegativeNumberException.class, () -> calculator.add(10, -20));
		}

		@Test
		@DisplayName("add(-10,-20)")
		void R002_T004() {
			assertThrows(NegativeNumberException.class, () -> calculator.add(-10, -20));
		}

		@Test
		@DisplayName("add(0,0)")
		void R002_T005() {
			assertEquals(0, calculator.add(0, 0));
		}
	}
}
