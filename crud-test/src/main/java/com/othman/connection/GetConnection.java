package com.othman.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
	public static Connection connection;
	public static Connection getConnection() {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		String url= "jdbc:mysql://localhost/jsptest";
		String username="root";
		String password="1234";
		connection=DriverManager.getConnection(url,username,password);
		return connection;
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
          }
        catch(SQLException e) {
        	e.printStackTrace();
           }
		return null;
		
		
		
		
		
		
		
	}

}
