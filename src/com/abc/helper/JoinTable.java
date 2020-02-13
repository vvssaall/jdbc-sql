package com.abc.helper;

import java.sql.Connection;

import java.sql.Statement;


public class JoinTable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection con=DbUtiliy.getConnection();
		

Statement stmt = con.createStatement();
String sql="select t.*,v.*from Tmobile t inner join vehicles v on t.id=v.id where t.name='Dilip'";

stmt.execute(sql);



	}

}