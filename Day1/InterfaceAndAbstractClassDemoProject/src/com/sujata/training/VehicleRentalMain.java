package com.sujata.training;

import com.sujata.demo.Audi;
import com.sujata.demo.BMW;
import com.sujata.demo.Bajaj;
import com.sujata.demo.Bike;
import com.sujata.demo.Car;
import com.sujata.demo.TVS;

public class VehicleRentalMain {

	public static void main(String[] args) {
		Car bmw=new BMW("Q5", "Blue");
		Car audi=new Audi("A8", "Red");
		
		Bike tvs=new TVS("Black");
		Bike bajaj=new Bajaj("Silver");
		
		Driver sonu=new Driver("Sonu");
		Driver monu=new Driver("Monu");
		
		monu.setVehicle(bajaj);
		monu.drive();

	}

}
