package com.abc.helper;

import java.sql.Connection;

import java.sql.Statement;


public class InertMainApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Connection con=DbUtiliy.getConnection();

Statement stmt = con.createStatement();
String sql="insert into Tmobile(name,ContactName,Address,City,Zip_code,Country) values('Vishal','Dilip','Fallchruh','Arlington','20004','USA')";

stmt.execute(sql);


	}

}
