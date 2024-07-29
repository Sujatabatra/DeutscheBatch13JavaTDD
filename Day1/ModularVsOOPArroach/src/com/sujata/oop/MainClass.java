package com.sujata.oop;   //package declaration

import java.util.Scanner; //multiple imports as per the need

/*
 * In our code if we are making use of any of the class from java.lang package, no need to use import statement.
 * If we are making use of any of the classes of any other package other then java.lang then use import statement 
 */

/*
 * Naming Conventions
 * 1. Clas Name should always be in PascalCase
 * 2. Method Name should always be in camelCase
 * 3. Variable Name should always be in camelCase
 * 4. Package Name should always be in lowercase
 */
public class MainClass {  //class declaration

	public static void main(String[] args) {
		Factorial factorial=new Factorial();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=scanner.nextInt();
		factorial.setNumber(num);
		/*
		 * Corrupt data : not possible,
		 * because while deciding data , we decided its visibility and accessebility as well 
		 */
		System.out.println("Factorial : "+factorial.getFactorial());

	}

}
