package guitarshop;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class obdc {
//	private static DataSource dataSource;
	public static Connection getConnection(){
		String driver="org.sqlite.JDBC";
		String sql="jdbc:sqlite://d:/Sqlite/guitarshop.db";
		Connection conn=null;
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(sql);
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;		
	}
}
