package com.sujata.training;

import com.sujata.demo.Vehicle;

public class Driver {

	private String name;
	private Vehicle vehicle; // Parents class reference variable (Interface)

	public Driver(String name) {
		super();
		this.name = name;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void drive() {
		System.out.print(name + " is driving ");
		vehicle.engine();
	}
}
