package main.dal;

import java.sql.Connection;

public interface IConnection {
	public abstract Connection getConnection();
}
