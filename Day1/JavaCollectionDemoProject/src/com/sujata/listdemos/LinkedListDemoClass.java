package com.sujata.listdemos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemoClass {

	public static void main(String[] args) {
		/*
		 * LinkedList is the dynamic duplicated ordered indexed collection of elements,
		 * and collection is auto-growable and auto-shrinkable
		 */
		 List<Integer> collection=new LinkedList<>();
		 
		 System.out.println("Size of collection : "+collection.size());
		 collection.add(10);  //0
		 collection.add(67);  //1
		 collection.add(45);  //2
		 
		 System.out.println("Size of collection : "+collection.size());
		 System.out.println(collection);
		 
		 collection.add(10);  //3
		 collection.add(89);  //4
		 collection.add(95);  //5
		 
		 System.out.println("Size of collection : "+collection.size());
		 System.out.println(collection);
		 
		 collection.remove(4);
		 
		 System.out.println("Size of collection : "+collection.size());
		 System.out.println(collection);
		 
		 collection.remove(Integer.valueOf(95));
		 

		 System.out.println("Size of collection : "+collection.size());
		 System.out.println(collection);
		 
		 System.out.println("Traversal using for each loop");
		 for(Integer element:collection) {
			 System.out.println(element);
		 }
		 
		 System.out.println("Traversal using traditional for loop");
		 for(int index=0;index<collection.size();index++) {
			 System.out.println(collection.get(index));
		 }
	}

}
