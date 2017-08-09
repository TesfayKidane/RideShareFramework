/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventorganizerframework.database.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Tesfay
 */
public class DatabaseConnection {

    private static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\Parsi\\git\\EventOrganizerFramework\\src\\resourceEventOrganizerDBMS.sqlite";
    private DatabaseConnection() {
    }

    public static Connection getSQLiteConnection() throws SQLException {
        return DriverManager.getConnection(CONNECTION_STRING);
    }
}
