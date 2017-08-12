package rideshare.framework.database.generic.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class TestClient {
	public static void main(String[] args) {
		SQLExecutor executor = new SimpleSQLExecutor();
		SQLPanel panel = new SimpleSQLPanel(executor);
		panel.connectToDatabase();
//		panel.update("INSERT INTO tbl_account (f_number,f_owner,f_balance) Values (985799,'Sam',10000)");
	
		ResultSet rs=panel.select("SELECT * FROM tbl_account");
		
       
        try {
        	while ( rs.next() ) {
                int number = rs.getInt("f_number");
                String owner = rs.getString("f_owner");
                long balance = rs.getLong("f_balance");
                System.out.printf("Number:%-5d Owner:%-8s Balance:%-5d \n",number,owner,balance);
            }
            
		} catch (Exception e) {
			System.out.println(e.toString());
		}
        
        panel.closeDBConnection();
//		
	}
}
