package framework.database.sql;

import java.sql.ResultSet;

import framework.database.sql.factory.DBConnectionFactory;
import framework.database.sql.factory.SimpleDBConnectionFactory;

public abstract class SQLExecutor {
	DBConnectionFactory dbConnectionFactory = SimpleDBConnectionFactory.getFactory();
	public abstract void update(String query);

	public abstract ResultSet select(String query);

	public abstract void executeSP(String statement);
	
	public abstract void connectToDatabase();
}
