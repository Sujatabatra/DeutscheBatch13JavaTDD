package com.sujata.demo;

import com.sujata.exception.NegativeNumberException;

public class Calculator {

	// R001 : divide two positive integers
	public int divide(int number1,int number2)throws ArithmeticException,NegativeNumberException {
		if(number1>=0 && number2>=0)
			return number1/number2;
		else
			throw new NegativeNumberException("Negative Integers not Allowed");
		
	}
	
	//R002 : add two positive integers
	public int add(int number1,int number2)throws NegativeNumberException {
		return 0;
	}
}
