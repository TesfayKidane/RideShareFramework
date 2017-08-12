package rideshare.framework.database.mysql.sql.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import rideshare.framework.database.mysql.sql.IDriverLoader;
import rideshare.framework.database.mysql.sql.PropertyFileReader;

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
