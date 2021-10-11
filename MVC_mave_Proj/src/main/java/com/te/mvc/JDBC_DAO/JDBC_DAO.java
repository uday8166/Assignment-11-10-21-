package com.te.mvc.JDBC_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_DAO implements JDBC_D {

	@Override
	public void update() {
		String ddUrl="jdbc:mysql://localhost:3306/employee1?user=root&password=admin";
		String qry="update Employee set name=? where id=? "; 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value for name : ");
		String name = scanner.next();
		System.out.println("Eter a value for id : ");
		int id = scanner.nextInt();
		
		Connection connection=null;
		PreparedStatement statement=null;
		try {
			connection = DriverManager.getConnection(ddUrl);
			statement = connection.prepareStatement(qry);
			statement.setInt(2, id);
			statement.setString(1, name);
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void read() {

		String dbUrl="jdbc:mysql://localhost:3306/employee1?user=root&password=admin";
		String qry="select * from Employee where id=?";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value for ID: ");
		int id=sc.nextInt(); 
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		try {
			connection = DriverManager.getConnection(dbUrl);
			preparedStatement = connection.prepareStatement(qry);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getInt(3));
				System.out.println(resultSet.getString(2));
			}
				} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete() {
		String dburl="jdbc:mysql://localhost:3306/employee1?user=root&password=admin";
		String qry = " delete from Employee where id=?";
		Connection connection=null;
		PreparedStatement statement = null;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a value for id : ");
		int id=scanner.nextInt();
		try {
			connection = DriverManager.getConnection(dburl);
			statement = connection.prepareStatement(qry);
			statement.setInt(1, id);
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
