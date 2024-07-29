package com.sujata.modular;

public class ModularFactorial {

	/*
	 * As we are mimicing , Modular behaviour from Java , thats why using
	 * static(Ignore static keyword for a time being)
	 * 
	 */

	// Data
	static int number, factorial;

	// Algo for input
	static void inputNumber(int num) {
		number = num;
	}

	// Algo for displaying factorial
	static void displayResult() {
		System.out.println("Factorial : " + factorial);
	}

	// Algo for calculating the factorial
	static void calcuateFactorial() {
		factorial = 1;
		while (number >= 1) {
			factorial *= number--;
		}
	}

	public static void main(String[] args) {
		inputNumber(4);
		calcuateFactorial();

		factorial = 7; // logical error

		displayResult();

	}

}
