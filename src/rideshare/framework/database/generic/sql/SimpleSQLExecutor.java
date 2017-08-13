package rideshare.framework.database.generic.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import rideshare.framework.database.generic.sql.factory.DBConnectionFactory;

public class SimpleSQLExecutor extends SQLExecutor {
	
	private Connection connection;
	
	@Override
	public void closeDBConnection() {
		try {
			connection.close();	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}

	public void connectToDatabase() {
		connection = DBConnectionFactory.createConnection();
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
//		String sql = "SELECT * FROM tbl_account";
		ResultSet results = null;
		try {
			
			Statement stmt = connection.createStatement();
	        
	        results = stmt.executeQuery(query);
	        
	        
	        
//	        results.close();
//	        stmt.close();
	        
//	        connection.close();
	        } 
		catch (Exception e) {
				System.out.println(e.toString());
			
			}
	        
	        return results;
	        
	        
       
		
        
	}

	

}
