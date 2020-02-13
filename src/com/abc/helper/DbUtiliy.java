package com.abc.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtiliy {
public static Connection getConnection() {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 Connection con=null;
	try {
		con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Customer_db","root","Dhikure1159");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
}
}
