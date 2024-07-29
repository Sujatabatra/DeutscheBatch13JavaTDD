package com.sujata.demo;


/*
 * 
 * int i;  //declaration
 * i=10;  //initialization
 * 
 * or 
 * 
 * int i=10;  /while declaring, we are initializing it as well
 * 
 */
public class MainHeight {

	public static void main(String[] args) {
		
		//ClassName objectName=new Constructor();
		
		Height height=new Height();  //declared
		height.display();
		
		height.input(5, 3);  //initialized
		height.display();

		Height height2=new Height(4, 8);   //while declaring, we are initializing it as well
		height2.display();
	
	}

}
