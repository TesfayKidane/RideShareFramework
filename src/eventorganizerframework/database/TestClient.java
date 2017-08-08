package eventorganizerframework.database;

public class TestClient {
	public static void main(String[] args) {
		SQLExecutor executor = new SimpleSQLExecutor();
		executor.connectToDatabase();
		executor.update("INSERT INTO tbl_account (f_number,f_owner,f_balance) Values (985799,'Sam',10000)");
	}
}
