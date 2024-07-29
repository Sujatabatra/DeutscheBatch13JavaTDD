package com.sujata.demo;

/*
 * Method Overloading 
 * Multiple method have same name
 * but all methods will get differentiated from one another as per method signature
 * method signature : number and type of arguments and their sequence
 */
public class Shape {

	void area(int length, int breadth) {
		int area = length * breadth;
		System.out.println("Area of Rectangle : " + area);
	}

	void area(int side) {
		int area = side * side;
		System.out.println("Area of Square : " + area);
	}
	
	void area(double radius) {
		double area=Math.PI*radius*radius;
		System.out.println("Area of Circle : "+area);
	}

}
