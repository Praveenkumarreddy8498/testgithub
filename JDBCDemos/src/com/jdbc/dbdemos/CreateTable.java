package com.jdbc.dbdemos;

import java.sql.*;

public class CreateTable {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/kumardb";
		String username = "root";
		String password = "pass123";
		String sql = "create table bookdb (title varchar(20),author varchar(20), category varchar(20),bookid integer,price integer)";
		Connection connection = null;
		Statement statement = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.createStatement();
			boolean val = statement.execute(sql);
			System.out.println("table created" + val);
		} catch (ClassNotFoundException|SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		finally {
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
