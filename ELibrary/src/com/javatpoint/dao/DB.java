package com.javatpoint.dao;

import java.sql.*;

public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		con=DriverManager.getConnection("jdbc:sqlserver://10.1.4.41:1433;databaseName=AppDynamicsTest;","sa","sysveda@123");
		
	}catch(Exception e){System.out.println(e);}
	return con;
}
}
