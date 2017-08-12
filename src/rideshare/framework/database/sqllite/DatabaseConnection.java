package rideshare.framework.database.sqllite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String CONNECTION_STRING = "jdbc:sqlite:D:\\framework\\PaymentDB.sqlite";
    private static Connection instance;
    private DatabaseConnection(){}

    public static Connection SQLiteConnection() throws SQLException {
            return DriverManager.getConnection(CONNECTION_STRING);  
    }
}
