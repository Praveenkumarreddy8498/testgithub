package com.jdbc.dbdemos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class UpdateDemo {

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
		//String sql = "update employee set city='Kent' where empid=99";
		String delsql = "delete from bookdb where bookid=9";

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.prepareStatement(delsql);
			statement.execute();

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
