package com.sujata.creational.factory;

public class PC extends Computer {

	private String RAM;
	private String HDD;
	private String CPU;

	
	public PC(String RAM, String hDD, String cPU) {
		super();
		RAM = RAM;
		HDD = hDD;
		CPU = cPU;
	}

	@Override
	public String getRAM() {
		return RAM;
	}

	@Override
	public String getHDD() {
		return HDD;
	}

	@Override
	public String getCPU() {
		return CPU;
	}

}
