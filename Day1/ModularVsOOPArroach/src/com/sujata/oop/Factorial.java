package com.sujata.oop;

public class Factorial {

	// decide data : input as well as output
	private int number, factorial;

	// decide which variable is readable and which variable is modifiable
	// create setter for modifiable variables : number
	// create getter for readable variables :factorial
	public void setNumber(int number) {
		this.number = number;
	}

	public int getFactorial() {
		calculateFactorial();
		return factorial;
	}
	
	private void calculateFactorial() {
		factorial=1;
		while(number>=1)
			factorial*=number--;
	}

}
