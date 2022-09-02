package com.jdbc.dbdemos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class SelectDemo {

	public static void main(String[] args) {
		Properties properties = new Properties();
		try {
			properties.load(new FileReader("jdbc.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String url = (String) properties.get("driver");
		String username = (String) properties.get("username");
		String password = (String) properties.get("password");
		String sql = "select * from employee";
		Connection connection = null;
		Statement statement = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.createStatement();
			ResultSet rs=statement.executeQuery(sql);
			while (rs.next()) {
				String name=rs.getString(1);
				int empid=rs.getInt(2);
				String city=rs.getString(3);
				System.out.println(name+"\t"+empid+"\t"+city);
				
			}
			
			

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (statement != null)
					connection.close();
				if (connection != null)
					statement.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				
			}
			
	
		}

		

	}

}
