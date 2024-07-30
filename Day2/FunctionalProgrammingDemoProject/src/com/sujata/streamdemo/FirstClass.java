package com.sujata.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstClass {

	public static void main(String[] args) {
		List<Integer> collection=Arrays.asList(98,10,20,33,45,31);
		
		long totalNoOfElements= collection.stream().count();
		System.out.println("Total Elements in collection : "+totalNoOfElements);
		
		collection.stream().forEach(ele->System.out.println(ele));
		System.out.println("=======================");
		collection.stream()    //Sequence of elements
		.filter(ele->ele%2==0)   //filtering data with predicate
		.forEach(ele->System.out.println(ele));  //terminating operation of displaying the values;

		System.out.println("=================");
		collection.stream()    //Sequence of elements
		.filter(ele->ele%2==0)   //filtering data with predicate
		.map(ele->ele+2)         //converting data
		.sorted()
		.forEach(ele->System.out.println(ele));  //terminating operation of displaying the values;

		
		List<Integer> evenList=collection.stream().filter(ele->ele%2==0).collect(Collectors.toList());
		
		System.out.println(evenList);
	}

}
