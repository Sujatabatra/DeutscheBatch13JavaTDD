package com.sujata.test;

/*
 * static import : importing all the static members of the specified class, in our case its Assertions class
 * benefit of using static import is that while calling the static members of the specified class(Assertions class) we need not to use class name
 */
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.sujata.demo.Calculator;
import com.sujata.exception.NegativeNumberException;

class ParamerizedTestCalculator {

	private Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
	}

	@Test
	@DisplayName("divide(50,10)")
	void R001_T001() {
		assertEquals(5, calculator.divide(50, 10));
	}

	@Test
	@DisplayName("divide(0,50)")
	void R001_T003() {
		assertEquals(0, calculator.divide(0, 50));
	}

	private static Stream<Arguments> provideValuesForDivide() {
		return Stream.of(Arguments.of(50, 0, ArithmeticException.class),
				Arguments.of(-50, 10, NegativeNumberException.class),
				Arguments.of(50, -10, NegativeNumberException.class),
				Arguments.of(-50, -10, NegativeNumberException.class),
				Arguments.of(0, -10, NegativeNumberException.class),
				Arguments.of(-50, 0, NegativeNumberException.class), Arguments.of(0, 0, ArithmeticException.class));
	}

	@ParameterizedTest(name = "divide({0},{1}) throws {2}")
	@MethodSource("provideValuesForDivide")
	@DisplayName("Testing divide method for different exceptions ")
	void testForExceptions(int number1, int number2, Class<Exception> exception) {
		assertThrows(exception, () -> calculator.divide(number1, number2));

	}

}
