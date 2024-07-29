package com.sujata.demo;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFileDemoClass {

	public static void main(String[] args) {
		
		FileWriter fileWriter=null;
		try {
			fileWriter=new FileWriter("DemoFile");
			
			String messsage="Today we are demonstrating File Input Output\nHow you all are feeling about it?";
			
			fileWriter.write(messsage);
			
			System.out.println("File Created !");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
