package com.sujata.creational.singleton;

public class SingleTonDemoClass {

	//Eager Initialization
	static private SingleTonDemoClass instance=new SingleTonDemoClass();
	
	private SingleTonDemoClass() {
		
	}
	void show() {
		System.out.println("Hi I am show method from SingleTonDemo class");
	}
	public static SingleTonDemoClass getInstance() {
		return instance;
	}
	
	
}
