package com.sujata.demo;

public class BMW extends Car {

	public BMW(String model, String color) {
		super(model, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void engine() {
		System.out.println(getModel()+" "+ getColor()+" color BMW engine goes BOOM" );

	}

}
