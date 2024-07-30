package com.sujata.demo;

import java.util.function.BinaryOperator;

@FunctionalInterface
interface Operate{
	int perform(int number1,int number2);
//	void show();
}

public class FirstDemoClass {

	public static void main(String[] args) {
		
		//Anonymous Inner class
//		Operate sum=new Operate() {
//			@Override
//			public int perform(int number1, int number2) {
//				return number1+number2;
//			}
//		};
		
//		Lambda : JDK 1.8
		
//		Operate sum=(number1,number2)->{
//			return number1+number2;
//		};
		
		
		Operate sum=(number1,number2)-> number1+number2;
		
		System.out.println("Sum of 10 and 20 : "+sum.perform(10, 20));

		BinaryOperator<Integer> product=(n1,n2)->n1*n2;
		
		System.out.println("Product of 7 and 9 : "+product.apply(7, 9));
	}

}
