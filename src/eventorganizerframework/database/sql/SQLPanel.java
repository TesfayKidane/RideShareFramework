package eventorganizerframework.database.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class SQLPanel {

	// DBConnectionFactory dbConnectionFactory = new
	// SimpleDBConnectionFactory();
	//
	// public void connectToDatabase() {
	//
	// connection =
	// dbConnectionFactory.createConnection("jdbc:mysql://localhost/banking",
	// "acm", "1234");
	//
	// }
	//
	// Connection connection;
	protected SQLExecutor executor;

	public abstract void update(String query);

	public abstract ResultSet select(String query);

	public abstract void executeSP(String statement);

	public abstract void connectToDatabase();

	public SQLPanel(SQLExecutor executor) {
		this.executor = executor;
		// TODO Auto-generated constructor stub
	}

}
