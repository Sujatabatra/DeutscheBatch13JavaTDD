package com.sujata.structural.decorator;

public class SportsCar extends CarDecorator {

	public SportsCar(Car car) {
		super(car);
		
	}
	
	public void assemble() {
		super.assemble();
		System.out.println("Adding features of Sports car");
	}

}
