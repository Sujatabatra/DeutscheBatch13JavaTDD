package com.sujata.creational.factory;

public class ComputerFactory {

	public static Computer getComputer(String type,String ram,String hdd,String cpu) {
		if(type.equalsIgnoreCase("PC"))
			return new PC(ram, hdd, cpu);
		else if(type.equalsIgnoreCase("server"))
			return new Server(ram, hdd, cpu);
		else
			return null;
	}
}
