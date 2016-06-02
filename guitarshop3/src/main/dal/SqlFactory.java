package main.dal;

import java.sql.Connection;

import main.dal.sqllite.Sqllite;
import main.dal.mysql.MySql;

public class SqlFactory {
	static Connection conn = null;
	public static Connection createConnection(String sql)
	{
        switch (sql)
        {
            case "mysql":
                {
                	conn = new MySql().getConnection();
                    break;
                }
            case "sqllite":
                {
                	conn = new Sqllite().getConnection();
                    break;
                }
        }
        return conn;
	}
	public static Connection getConnection()
	{
		return conn;
	}
}
