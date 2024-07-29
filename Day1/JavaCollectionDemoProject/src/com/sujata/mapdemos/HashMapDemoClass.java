package com.sujata.mapdemos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemoClass {

	public static void main(String[] args) {
		/*
		 * HashMap is dynamic unordered collection of key values pairs,
		 * where keys are unique but values can be duplicated and 
		 * unordering is wrt key.
		 */
		Map<String, Integer> months=new HashMap<>();
		
		System.out.println("Size of Map Collection : "+months.size());
		months.put("Jan", 31);
		months.put("Feb", 28);
		months.put("Mar", 31);
		months.put("Apr", 30);
		
		System.out.println("Size of Map Collection : "+months.size());
		System.out.println(months);
		
		months.put("May", 31);
		months.put("Jun", 30);
		months.put("Jul", 31);
		months.put("Feb", 29);  //for duplicate key, value will be overridden
		
		
		System.out.println("Size of Map Collection : "+months.size());
		System.out.println(months);
		
		Set<String> monthNames=months.keySet();
		for(String monthName:monthNames) {
			System.out.println(monthName+" contains "+months.get(monthName)+" days");
		}
		
		
	}

}
