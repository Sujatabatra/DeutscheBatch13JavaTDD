package com.muskan.demo;

import com.sujata.demo.Student;

public class Marks extends Student {

	private int marks1, marks2, marks3;

	public int getMarks1() {
		return marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public int getMarks3() {
		return marks3;
	}

	//Method Overloading
	void input(int rollNumber,String name,int marks1,int marks2,int marks3) {
		input(rollNumber, name);
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	
	/*Method Overriding : method name and arguments are same
	 * Method over riding can happen in derived class only
	 * 
	 */
	public void display() {
		super.display();  //calling the base class display method
		System.out.println("Marks1 : "+marks1);
		System.out.println("Marks2 : "+marks2);
		System.out.println("Marks3 : "+marks3);
	}
}
