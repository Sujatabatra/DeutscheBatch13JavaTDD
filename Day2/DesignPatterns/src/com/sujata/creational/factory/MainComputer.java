package com.sujata.creational.factory;

import java.util.Scanner;

public class MainComputer {

	public static void main(String[] args) {
		
		Computer computer=ComputerFactory.getComputer("server", "100 GB", "100 TB", "2.9 GHz");
		System.out.println(computer.getClass());

	}

}
