package com.frozen.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DBHelper{
	private static Properties prop = new Properties();
	
	public static Connection getConnection(){
		Connection conn = null;
		InputStream in = null;
		try {
			in = DBHelper.class.getClassLoader().getResourceAsStream("config.properties");
			prop.load(in);
			//System.out.println(prop.getProperty("DRIVER"));
			Class.forName(prop.getProperty("DRIVER"));
			conn = DriverManager.getConnection(prop.getProperty("URL"),prop.getProperty("USER"),prop.getProperty("PSW"));

			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//conn = DriverManager.getConnection(prop.getProperty("URL"),prop.getProperty("USER"),prop.getProperty("PSW"));

			//conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		} catch (Exception e) {

			e.printStackTrace();
		}

		return conn;
		
	}
	public static void closeConnection(Connection conn){
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] args) {
//		Connection conn = DBHelper.getConnection();
//		System.out.println(conn);
//		DBHelper.closeConnection(conn);
//	}

}
