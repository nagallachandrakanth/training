package com.jsp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMultipleData {


	public static void insertData(Employee employee) {
		String url = "jdbc:mysql://localhost:3306/employee?user=root&password=root";
		String query = "insert into employee values('"+employee.getSlno()+"','"+employee.getname()+"','"+employee.getemail()+"','"+employee.getphonenumber()+"')";
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url);
			preparedStatement = connection.prepareStatement(query);
			int executeUpdate = preparedStatement.executeUpdate();
			System.out.println(executeUpdate);
			connection.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
