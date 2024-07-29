package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SecondDemoClass {

	public static void main(String[] args) {
		
		Connection connection=null;
	
		Scanner scanner=new Scanner(System.in);
		try {
//			1.Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.OracleDriver");
			
//			1.2 Connect to DB
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "sujata");			
//			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "system", "oracle");  : for Virtual Machine
			
//			2.Query
			PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO SHARES VALUES(?,?,?)");
			
			System.out.println("Enter Share ID : ");
			int id=scanner.nextInt();
			System.out.println("Enter Share Name : ");
			String name=scanner.next();
			System.out.println("Enter Share Market Price : ");
			double price=scanner.nextDouble();
			
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setDouble(3, price);
			
			/*
			 * For all DML statement, use executeUpdate() method, whose Return Type is int
			 */
			int rows=preparedStatement.executeUpdate();
			
//			3.Process Result
			if(rows>0)
				System.out.println("Share Added ");
			else
				System.out.println("New Share Record Not Added");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
//				4.Close connection
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
