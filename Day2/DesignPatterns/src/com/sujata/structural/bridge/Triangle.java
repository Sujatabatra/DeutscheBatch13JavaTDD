package com.sujata.structural.bridge;

public class Triangle extends Shape {

	public Triangle(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.print("Triangle is filled with colod ");
		color.applyColor();

	}

}
