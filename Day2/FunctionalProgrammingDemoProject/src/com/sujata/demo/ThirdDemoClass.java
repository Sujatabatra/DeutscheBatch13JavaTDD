package com.sujata.demo;

import java.util.function.Consumer;

public class ThirdDemoClass {

	public static void main(String[] args) {
		Consumer<String> greet=str->System.out.print("Welcome "+str);

		greet.accept("Jinsha");
	}

}
