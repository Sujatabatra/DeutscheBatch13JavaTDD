package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemoClass {

	public static void main(String[] args) {
		/*
		 * HashSet is the dynamic unique unordered collection of objects ,
		 * which are auto-growable and auto-shrinkable
		 */
		
		Set<Integer> collection=new HashSet<>();

		System.out.println("Size of collection : "+collection.size());
		collection.add(10);
		collection.add(20);
		collection.add(3);
		
		System.out.println("Size of collection : "+collection.size());
		System.out.println(collection);
		
		collection.add(100);
		collection.add(45);
		collection.add(3);
		
		System.out.println("Size of collection : "+collection.size());
		System.out.println(collection);
		
		collection.remove(3);
		
		System.out.println("Size of collection : "+collection.size());
		System.out.println(collection);
		
		System.out.println("Traversal using for each loop");
		for(Integer element:collection) {
			System.out.println(element);
		}
	}

}
