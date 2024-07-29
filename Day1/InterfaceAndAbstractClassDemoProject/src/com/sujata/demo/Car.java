package com.sujata.demo;


/*
 * 
 * Abstract class means implement certain part of class which all child classes need,
 * but signing the contract(int the form of abstract method) with child classes,
 * to give their own specialized implementaion of the contract
 * 
 * Abstract class : we won't be able to create object of abstract class
 * if a single method is abstract then its mandatory to mark that class as abstract
 */
abstract public class Car implements Vehicle {

	private String model,color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}
	
	
	
//	//abstract
//	public void engine();
}
