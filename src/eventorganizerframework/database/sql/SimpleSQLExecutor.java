package eventorganizerframework.database.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SimpleSQLExecutor extends SQLExecutor {
	private Connection connection;

	public void connectToDatabase() {

		connection = dbConnectionFactory.createConnection();

	}

	@Override
	public void update(String query) {
		// TODO Auto-generated method stub
		try {
			Statement stmt = connection.createStatement();

			stmt.executeUpdate(query);

			stmt.close();
			connection.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public ResultSet select(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void executeSP(String statement) {
		// TODO Auto-generated method stub

	}

}
