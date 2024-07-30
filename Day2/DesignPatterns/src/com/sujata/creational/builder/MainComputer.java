package com.sujata.creational.builder;

public class MainComputer {

	public static void main(String[] args) {
		Computer computer=new Computer.ComputerBuilder("10TB", "512 GB").setBlueToothEnabled(true).build();
		System.out.println(computer);

	}

}
