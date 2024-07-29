package com.sujata.demo;

import java.util.Scanner;

public class MyFirstClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		try {
		System.out.println("Enter First Number : ");
		int number1=scanner.nextInt();
		System.out.println("Enter Second Number : ");
		int number2=scanner.nextInt();
		
		int result=number1/number2;   //-->Exception (Abrupt Termination at this line)
		
		System.out.println("Result : "+result);
		}
		//exception handler for ArithmeticException (ArithmeticException parent class is RunTimeException, thats why its unchecked exception) 
		catch (ArithmeticException exception) {
			System.out.println("undefined");
		}
		/*
		 * After all the specific exception handlers, always give generic exception handler
		 * 
		 */
		catch (Exception e) {
			System.out.println("Something wemt wrong, please try after sometime!");
		}
		finally {
			System.out.println("Hi I am finally block");
		}
		System.out.println("Good Bye from main!");

	}

}
