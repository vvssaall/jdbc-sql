package com.abc.helper;

import java.sql.Connection;

import java.sql.Statement;


public class UpdateMainApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection con=DbUtiliy.getConnection();
		

Statement stmt = con.createStatement();
String sql="update vehicles set color='black' where id=2";

stmt.execute(sql);


	}

}