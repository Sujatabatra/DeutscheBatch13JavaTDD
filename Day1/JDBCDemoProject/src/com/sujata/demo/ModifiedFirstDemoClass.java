package com.sujata.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class ModifiedFirstDemoClass {

	public static void main(String[] args) {
		
		Connection connection=null;
	
		try {
			
			InputStream fileInputStream=new FileInputStream("resources/DbConnection.properties");
			Properties prop=new Properties();
			
			prop.load(fileInputStream);
			
//			1.Connect
//			1.1 Register Driver
			Class.forName(prop.getProperty("datasource.driverClassName"));
			
//			1.2 Connect to DB
			connection=DriverManager.getConnection(prop.getProperty("datasource.url"), prop.getProperty("datasource.username"), prop.getProperty("datasource.password"));			
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
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
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
