package eventorganizerframework.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class SQLExecutor {

	DBConnectionFactory dbConnectionFactory = new SimpleDBConnectionFactory();

	public void connectToDatabase() {

		connection = dbConnectionFactory.createConnection("jdbc:mysql://localhost/banking", "acm", "1234");

	}

	Connection connection;

	public SQLExecutor() {

		// TODO Auto-generated constructor stub
	}

	public abstract void update(String query);

	public abstract ResultSet select(String query);

	public abstract void executeSP(String statement);
}
