package com.sujata.oop;

public class MainClass {

	public static void main(String[] args) {
		Factorial factorial=new Factorial();
		
		factorial.setNumber(4);
		/*
		 * Corrupt data : not possible,
		 * because while deciding data , we decided its visibility and accessebility as well 
		 */
		System.out.println("Factorial : "+factorial.getFactorial());

	}

}
