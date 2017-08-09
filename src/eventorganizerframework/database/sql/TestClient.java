package eventorganizerframework.database.sql;

public class TestClient {
	public static void main(String[] args) {
		SQLExecutor executor = new SimpleSQLExecutor();
		SQLPanel panel = new SimpleSQLPanel(executor);
		panel.connectToDatabase();
		panel.update("INSERT INTO tbl_account (f_number,f_owner,f_balance) Values (985799,'Sam',10000)");
	
//		new TestPropertyFile().createPropertyFile();
//		new TestPropertyFile().printFile();
	}
}
