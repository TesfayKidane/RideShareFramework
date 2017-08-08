package eventorganizerframework.database;

import java.sql.ResultSet;

public abstract class SQLExecutor {
	DBConnectionFactory dbConnectionFactory = new SimpleDBConnectionFactory();
	public abstract void update(String query);

	public abstract ResultSet select(String query);

	public abstract void executeSP(String statement);
	
	public abstract void connectToDatabase();
}
