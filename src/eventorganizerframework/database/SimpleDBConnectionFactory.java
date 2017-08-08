package eventorganizerframework.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleDBConnectionFactory implements DBConnectionFactory {
	IDriverLoader driverLoader;
	
	public Connection createConnection(String connectionString, String username, String password)
{
		driverLoader = new SimpleDriverLoaderFactory().createDriverLoader(connectionString);
		driverLoader.load();
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(connectionString, username, password); 
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return connection;
		
	}

	
}
