package com.sujata.structural.bridge;

public class MainShape {

	public static void main(String[] args) {
		Shape tri=new Triangle(new Green());
		tri.applyColor();

	}

}
