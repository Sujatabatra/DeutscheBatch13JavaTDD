package com.sujata.demo;

import java.util.function.Function;

@FunctionalInterface
interface Find {
	int get(String str);
}

public class SecondDemoClass {

	public static void main(String[] args) {
		
//		Find find = new Find() {
//
//			@Override
//			public int get(String str) {
//				return str.length();
//			}
//		};
		
		Find find = str-> str.length();
		
		System.out.println("Length of Sujata : "+find.get("Sujata"));
		
		Function<String, Integer> findLength=str->str.length();
		
		System.out.println("length of Sujata Batra : "+findLength.apply("Sujata Batra"));
	}

}
