package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FirstDemoClass {

	public static void main(String[] args) {
		
		Connection connection=null;
	
		try {
//			1.Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.OracleDriver");
			
//			1.2 Connect to DB
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "sujata");			
//			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "system", "oracle");  : for Virtual Machine
			
//			2.Query
			PreparedStatement preparedStatement=connection.prepareStatement("SELECT * from SHARES");
			
			/*
			 * For all DQL statement, use executeQuery() method, whose Return Type is ResultSet
			 */
			ResultSet resultSet=preparedStatement.executeQuery();
			
//			3.Process Result
			while(resultSet.next()) {
				int id=resultSet.getInt("SHAREID");
				String name=resultSet.getString("SHARENAME");
				double price=resultSet.getDouble("MARKETPRICE");
				
				System.out.println(id+"  "+name+"  "+price);
			}
			
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
