package comm.example;
import java.sql.*;


public class MySqlConnectionFactory{
	private static Connection connection=null;
	private static MySqlConnectionFactory connectionFactory;
	public MySqlConnectionFactory() throws SQLException{
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/courses","root","135246");
	}
	public static MySqlConnectionFactory createConnection() throws SQLException{
		if(connectionFactory==null)
		{
			connectionFactory=new MySqlConnectionFactory();
		}
		return connectionFactory;
	}
	public Connection getConnection() throws SQLException
	{
		return connection;
	}

}
