package framework.database.sql;

import java.sql.ResultSet;
import java.sql.Statement;

public class SimpleSQLPanel extends SQLPanel {

	@Override
	public void connectToDatabase() {
		// TODO Auto-generated method stub
		executor.connectToDatabase();
	}

	public SimpleSQLPanel(SQLExecutor executor) {
		super(executor);

		// TODO Auto-generated constructor stub
	}

	// private SQLExecutor executor = new SimpleSQLExecutor();
	@Override
	public void update(String query) {
		// TODO Auto-generated method stub
		executor.update(query);
	}

	@Override
	public ResultSet select(String query) {
		// TODO Auto-generated method stub
		return executor.select(query);
	}

	@Override
	public void executeSP(String statement) {
		// TODO Auto-generated method stub
		executor.executeSP(statement);

	}

}
