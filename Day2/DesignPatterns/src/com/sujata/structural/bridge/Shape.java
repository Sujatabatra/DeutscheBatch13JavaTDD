package com.sujata.structural.bridge;

abstract public class Shape {

	protected Color color;

	public Shape(Color color) {
		super();
		this.color = color;
	}

	abstract public void applyColor();
}
