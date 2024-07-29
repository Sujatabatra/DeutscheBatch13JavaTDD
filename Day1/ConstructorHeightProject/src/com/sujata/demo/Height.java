package com.sujata.demo;

/*
 * Constructor
 * 1. constructor name must be same as that of your class name
 * 2. constructor can be argumented as well as non argumented
 * 3. constructor dpn't return any value not even void
 * 4. constructor can be in any of the scope, ie. private, protected, default and public
 * 
 * Note: If class is constructor challenged, then compile automatically creates one default constructor(ie. zero argument constructor) for that class.
 */
public class Height {

	private int feet;
	private int inches;
	
	/*
	 * Constructor Overloading
	 * Constructor overloading : constructor name is same but differentaited with respect to constructor signature
	 * constructor signation means : number and type of arguments and their sequence
	 */
	public Height() {
		this.feet=this.inches=1;
		
	}
	
	public Height(int feet, int inches) {
		super();
		this.feet = feet;
		this.inches = inches;
	}


	public Height(int feet) {
		super();
		this.feet = feet;
	}

	public int getFeet() {
		return feet;
	}
	public void setFeet(int feet) {
		this.feet = feet;
	}
	public int getInches() {
		return inches;
	}
	public void setInches(int inches) {
		this.inches = inches;
	}
	
	void input(int feet,int inches) {
		this.feet=feet;
		this.inches=inches;
	}
	
	void display() {
		System.out.println("Height : "+feet+" feet(s)"+inches+" inche(s)");
	}
}
