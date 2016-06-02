package main.dal.mysql;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import main.dal.IConnection;

public class MySql implements IConnection {
	// private static DataSource dataSource;
	public Connection getConnection() {
		String driver="com.mysql.jdbc.Driver";
		String sql="jdbc:mysql://127.0.0.1/student";
		Connection conn=null;
		String user = "root";  
		String password = "123456";  
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(sql,user,password);
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;		
	}
}
