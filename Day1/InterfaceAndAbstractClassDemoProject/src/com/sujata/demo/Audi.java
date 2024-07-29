package com.sujata.demo;

public class Audi extends Car {

	public Audi(String model, String color) {
		super(model, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void engine() {
		System.out.println(getModel()+ " "+getColor()+" color Audi engine goes AOOM" );

	}

}
