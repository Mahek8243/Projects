package com.tka.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class IplUtility {

	public static void loadDriverUtility(String driver) throws ClassNotFoundException {
		//System.out.println("We are use Load Driver Utility");
		Class.forName(driver);
	}

	public static Connection getConnectionUtility(String url, String uname, String pwd) throws SQLException {
		//System.out.println("We are use get Connection Utility");
		Connection con = DriverManager.getConnection(url, uname, pwd);
		return con;

	}
	public static Statement createStatementUtility(Connection con) throws SQLException {
		//System.out.println("We are use create Statement Utility");
		Statement sta = con.createStatement();
		return sta;
	}
	
	public static ResultSet resultSetUtility(Statement sta,String sql) throws SQLException {
		//System.out.println("We are use resultSet Utility");
		ResultSet rs = sta.executeQuery(sql);
		return rs;
	}
	
	public static int executeUpadateUtility(Statement sta,String sql) throws SQLException {
		//System.out.println("We are use resultSet Utility");
		int ii = sta.executeUpdate(sql);
		return ii;
	}
	
	public static boolean checkJerseyNoUtility(int jn) {
		if(jn>0 && jn<1000) {
			return true;
		}
		return false;
	}

}
