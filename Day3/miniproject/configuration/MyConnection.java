package com.ltts.Configuration;

	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class MyConnection {
		public static Connection getConnection() throws SQLException
		{
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","root");
			
			return c;
			
		}

	}
