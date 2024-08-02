package com.sujata.exception;

/*
 * NegativeNumberException is unchecked exception as it is the child class of RunTimeException
 * 
 * if we want to make our class checked exception then we must make child class of Exception
 */
public class NegativeNumberException extends RuntimeException {
	
	public NegativeNumberException(String message) {
		super(message);
	}

}
