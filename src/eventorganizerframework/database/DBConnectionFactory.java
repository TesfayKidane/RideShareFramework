package eventorganizerframework.database;

import java.sql.Connection;

public interface DBConnectionFactory {
	public Connection createConnection(String connectionString, String username, String password);
}
