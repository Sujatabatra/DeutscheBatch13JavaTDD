package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Set;

public class PersonHashSetDemoClass {

	public static void main(String[] args) {
		/*
		 * HashSet is the dynamic unique unordered collection of objects ,
		 * which are auto-growable and auto-shrinkable
		 */
		
		Set<Person> collection=new HashSet<>();

		System.out.println("Size of collection : "+collection.size());
		collection.add(new Person(1, "AAAA", 56));
		collection.add(new Person(2, "BBBB", 65));
		collection.add(new Person(3, "CCCC", 34));
		
		System.out.println("Size of collection : "+collection.size());
		System.out.println(collection);
		/*
		 * Internally add method make use of equals and hashcode method of object class to identify the uniqueness of objects
		 * 
		 * If two objects hashcodes are same , they might not be meaningfully equal
		 * and if two objects are meaningfully equal then their hashcode must also be same 
		 */
		collection.add(new Person(2, "BBBB", 65));
		collection.add(new Person(4, "DDDD", 89));
		
		System.out.println("Traversal using for each loop");
		for(Person element:collection) {
			System.out.println(element);  //toString() : implicit call , toString() belongs to Object class and display hashcode with complete class name
		}
	}

}
