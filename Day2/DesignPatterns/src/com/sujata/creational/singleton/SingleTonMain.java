package com.sujata.creational.singleton;

public class SingleTonMain {

	public static void main(String[] args) {
//		SingleTonDemoClass singleTonDemoClass=new SingleTonDemoClass();
		
		SingleTonDemoClass obj1=SingleTonDemoClass.getInstance();
		
		SingleTonDemoClass obj2=SingleTonDemoClass.getInstance();
		
		System.out.println("obj1 : "+obj1);
		System.out.println("obj2 : "+obj2);

	}

}
