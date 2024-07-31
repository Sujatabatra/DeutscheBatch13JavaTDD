package com.sujata.persistence;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sujata.config.ConfigProperties;
import com.sujata.entity.Share;

//@Component
@Repository
public class ShareDaoImpl implements ShareDao {

	@Autowired
	private ConfigProperties configProperties;
	
	@Override
	public List<Share> getAllRecord() {
		Connection connection = null;
		List<Share> shareList = new ArrayList();
		try {

//			InputStream fileInputStream = new FileInputStream("resources/DbConnection.properties");
//			Properties prop = new Properties();
//
//			prop.load(fileInputStream);

			Class.forName(configProperties.getConfigValue("datasource.driverClassName"));

			connection = DriverManager.getConnection(configProperties.getConfigValue("datasource.url"),
					configProperties.getConfigValue("datasource.username"), configProperties.getConfigValue("datasource.password"));

			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * from SHARES");
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int id = resultSet.getInt("SHAREID");
				String name = resultSet.getString("SHARENAME");
				double price = resultSet.getDouble("MARKETPRICE");

				Share share = new Share(id, name, price);
				shareList.add(share);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return shareList;
	}

	@Override
	public int saveRecord(Share share) {
		Connection connection = null;
		int rows=0;
		try {

//			InputStream fileInputStream = new FileInputStream("resources/DbConnection.properties");
//			Properties prop = new Properties();
//
//			prop.load(fileInputStream);

			Class.forName(configProperties.getConfigValue("datasource.driverClassName"));

			connection = DriverManager.getConnection(configProperties.getConfigValue("datasource.url"),
					configProperties.getConfigValue("datasource.username"), configProperties.getConfigValue("datasource.password"));

			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO SHARES VALUES(?,?,?)");
			preparedStatement.setInt(1, share.getShareId());
			preparedStatement.setString(2, share.getShareName());
			preparedStatement.setDouble(3, share.getMarketPrice());
			rows = preparedStatement.executeUpdate();

			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			return rows;
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	@Override
	public Share getRecordById(int shareId) {
		Connection connection = null;
		Share share=null;
		try {

//			InputStream fileInputStream = new FileInputStream("resources/DbConnection.properties");
//			Properties prop = new Properties();
//
//			prop.load(fileInputStream);

			Class.forName(configProperties.getConfigValue("datasource.driverClassName"));

			connection = DriverManager.getConnection(configProperties.getConfigValue("datasource.url"),
					configProperties.getConfigValue("datasource.username"), configProperties.getConfigValue("datasource.password"));

			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * from SHARES WHERE SHAREID=?");
			preparedStatement.setInt(1, shareId);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				int id = resultSet.getInt("SHAREID");
				String name = resultSet.getString("SHARENAME");
				double price = resultSet.getDouble("MARKETPRICE");

				share = new Share(id, name, price);
				
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return share;
		
	}

}
