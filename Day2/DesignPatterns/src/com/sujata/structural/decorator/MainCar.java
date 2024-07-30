package com.sujata.structural.decorator;

public class MainCar {
	
	public static void main(String args[]) {
		
		BMW bmw1=new BMW();
		BMW bmw2=new BMW();
		
		Audi audi1=new Audi();
		Audi audi2=new Audi();
	
//		audi2.assemble();
		
		Car sportsCar=new SportsCar(bmw2);
		sportsCar.assemble();
	}

}
