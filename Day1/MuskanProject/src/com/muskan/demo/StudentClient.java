package com.muskan.demo;

import com.sujata.demo.Student;

public class StudentClient {

	public static void main(String[] args) {
		Student student=new Student();
		student.input(101, "AAAAA");
		student.display();
		
		System.out.println("==================");
		
		Marks marks=new Marks();
		marks.input(1, "ABCD", 89, 67, 78);
		/*
		 * we have two display one from Student class and One I have over ridden in Marks
		 * but which display will get called,
		 * will be decided by the type of object
		 */
		marks.display();  
		System.out.println("==========================");
		/*
		 * Base class reference variable is type compatible with derived class
		 * 
		 * BaseClass referenceVariable= new BaseClass();
		 * BaseClass referenceVariable=new DerivedClass();
		 * 
		 * but the reverse is not true, that derived class reference variable is not type compatible with base class
		 * 
		 * DeriveClass referenceVariable=new DrivedClass();  (Correct)
		 * DeriveClass referenceVariable=new BaseClass(); (Incorrect)
		 */
		Student s;
		
		s=new Student();  //correct;
		s.display(); 
		System.out.println("***********************");
		s=new Marks();   //correct;
		
		s.display();

	}

}
