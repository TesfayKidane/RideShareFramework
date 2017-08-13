package rideshare.framework.database.generic.sql;

import java.sql.ResultSet;

import rideshare.framework.database.generic.sql.factory.DBConnectionFactory;
import rideshare.framework.database.generic.sql.factory.SimpleDBConnectionFactory;

public abstract class SQLExecutor {
	DBConnectionFactory dbConnectionFactory = SimpleDBConnectionFactory.getFactory();
	public abstract void update(String query);

	public abstract ResultSet select(String query);

	
	
	public abstract void connectToDatabase();
	public abstract void closeDBConnection();
}
