package hyoungki.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionMaker implements ConnectionMaker{
	
	@Override
	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection c	= DriverManager.getConnection(
				"jdbc:sqlserver://192.168.1.59:1433;DatabaseName=CURIX55_TEST2", "sa", "1234");

		return c;
	}
}
