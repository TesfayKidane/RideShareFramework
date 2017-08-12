package rideshare.framework.database.mysql.sql;

import java.sql.ResultSet;

import rideshare.framework.database.mysql.sql.factory.DBConnectionFactory;
import rideshare.framework.database.mysql.sql.factory.SimpleDBConnectionFactory;

public abstract class SQLExecutor {
	DBConnectionFactory dbConnectionFactory = SimpleDBConnectionFactory.getFactory();
	public abstract void update(String query);

	public abstract ResultSet select(String query);

	public abstract void executeSP(String statement);
	
	public abstract void connectToDatabase();
}
