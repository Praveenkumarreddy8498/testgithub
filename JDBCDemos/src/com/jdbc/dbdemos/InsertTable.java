package com.jdbc.dbdemos;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class InsertTable {

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
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
			ps = connection.prepareStatement("insert into bookdb values(?,?,?,?,?)");
			Scanner sc = new Scanner(System.in);

			for (int i = 1; i <= 3; i++) {
				System.out.println("enter book by title,author,category,bookid,price");
				String title = sc.nextLine();
				String author = sc.nextLine();
				String category = sc.nextLine();
				int bookid = sc.nextInt();
				int price = sc.nextInt();
				ps.setString(1, title);
				ps.setString(2, author);
				ps.setString(3, category);
				ps.setInt(4, bookid);
				ps.setInt(5, price);
				ps.execute();

			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());

			}

		}

	}

}
