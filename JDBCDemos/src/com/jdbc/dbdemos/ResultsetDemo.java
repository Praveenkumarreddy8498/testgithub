package com.jdbc.dbdemos;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class ResultsetDemo {
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
		// String sql = "update employee set city='Kent' where empid=99";
		// String delsql = "delete from bookdb where bookid=?";

		Connection connection = null;
		PreparedStatement statement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.prepareStatement("delete from bookdb where bookid=?");
			statement.setInt(1, 1);
			int i=statement.executeUpdate();
			if (i==0)
				throw new BookNotFoundException();
			else
			System.out.println("deleted");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					connection.close();
				if (connection != null)
					statement.close();
			} catch (SQLException e) {
				e.printStackTrace();

			}

		}

	}

}
