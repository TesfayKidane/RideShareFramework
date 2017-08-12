/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rideshare.framework.database.generic;

import java.sql.SQLException;

import rideshare.framework.database.generic.sql.DatabaseConnection;

/**
 *
 * @author Tesfay
 */
public class TestDatabaseConnection {
    
   public static void main(String[] args) throws SQLException{
         System.out.println(DatabaseConnection.getSQLiteConnection().getSchema());
   }
}
