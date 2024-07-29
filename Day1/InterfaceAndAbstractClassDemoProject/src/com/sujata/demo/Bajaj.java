package com.sujata.demo;

public class Bajaj extends Bike {

	public Bajaj(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void engine() {
		System.out.println(getColor()+" color Bajaj Engine says Hamara Bajaj");

	}

}
