package com.abc.helper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SellectMainApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection con = DbUtiliy.getConnection();

		Statement stmt = con.createStatement();
		String sql = "select * from Tmobile";

		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {

			int id = rs.getInt("id");
			String NameList = rs.getString("name");
			String AddressList = rs.getString("Address");
			System.out.println("id:" + id + "  Name:" + NameList +"  Address:" + AddressList);
		}

	}

}
