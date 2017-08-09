package eventorganizerframework.database.sql.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import eventorganizerframework.database.sql.IDriverLoader;
import eventorganizerframework.database.sql.PropertyFileReader;

public class SimpleDBConnectionFactory implements DBConnectionFactory {
	IDriverLoader driverLoader;
	private static DBConnectionFactory factory = new SimpleDBConnectionFactory();

	public static DBConnectionFactory getFactory() {
		return factory;
	}

	public Connection createConnection() {
		PropertyFileReader reader = new PropertyFileReader();
		String dbUrl =reader.getDbUrl();
		String dbUsername =reader.getDbUsername();
		String dbPassword=reader.getDbPassword();
		
		driverLoader = SimpleDriverLoaderFactory.getFactory().createDriverLoader();
		driverLoader.load();
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return connection;

	}

}
