package rideshare.framework.database.generic.sql;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class SQLPanel {

	
	protected SQLExecutor executor;

	public abstract void update(String query);

	public abstract ResultSet select(String query);

	

	public abstract void connectToDatabase();
	public abstract void closeDBConnection();

	public SQLPanel(SQLExecutor executor) {
		this.executor = executor;
		// TODO Auto-generated constructor stub
	}

}
