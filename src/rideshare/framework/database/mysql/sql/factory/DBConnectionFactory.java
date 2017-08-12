package rideshare.framework.database.mysql.sql.factory;

import java.sql.Connection;

public interface DBConnectionFactory {
	public Connection createConnection();
}
