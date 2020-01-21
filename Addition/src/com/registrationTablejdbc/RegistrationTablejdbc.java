package com.registrationTablejdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegistrationTablejdbc {
	
	public static void checkStatus(String name) {
		final String jdbcDriver = "com.mysql.jdbc.Driver"; 
		final String url = "jdbc:mysql://localhost:3306/registration?"+"autoReconnect=true&useSSL=false";
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName(jdbcDriver);
			 connection = DriverManager.getConnection(url,"root","bridgeit");
			 statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from registrationtable");
			
			while(result.next()) {
				if(result.getString("name").equalsIgnoreCase(name)) {
					//System.out.println("name is match ");
					System.out.println(result.getString("name") + " == nameCheck");
				}
				
			}
			connection.close();	
		}catch(Exception e){
			
		}
	}
	
	public static void jdbcQueryExecute(String name, String jdbcDriver, String url){
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName(jdbcDriver);
			 connection = DriverManager.getConnection(url, "root", "bridgeit");
			 statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from registrationtable");
			while(result.next()) {
				System.out.println(result.getString(name) + " ");
			}
			
			connection.close();	
		}catch(Exception e){
			
		}
	}
	
	static final String jdbcDriver = "com.mysql.jdbc.Driver"; 
	static final String url = "jdbc:mysql://localhost:3306/registration?"+"autoReconnect=true&useSSL=false";
	public static void main(String args[]) {
		String name = "varad";
		//RegistrationTablejdbc.jdbcQueryExecute(name, jdbcDriver, url);
		RegistrationTablejdbc.checkStatus(name);
	}
	
	
}
