package com.sujata.creational.singleton;

public class SingleTonDemoClassTwo {

	
	static private SingleTonDemoClassTwo instance;
	
	private SingleTonDemoClassTwo() {
		
	}
	void show() {
		System.out.println("Hi I am show method from SingleTonDemo class");
	}
	public static SingleTonDemoClassTwo getInstance() {
		//lazy Initialization
		if(instance==null)
			instance=new SingleTonDemoClassTwo();
		return instance;
	}
	
	
}
