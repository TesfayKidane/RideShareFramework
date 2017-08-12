package rideshare.framework.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import rideshare.framework.database.sqllite.DatabaseConnection;

public interface IDataManager<T> {
    T getElement(int id);
    List<T> getElements();
    List<T> getElements(Object obj1,Object obj2);
    boolean add(T element);
    boolean update(T element);
    boolean delete(T element);

    default ResultSet executeQuery(String query) throws Exception {
        Connection connection = DatabaseConnection.SQLiteConnection();
        Statement statement = connection.createStatement();

        Class.forName("org.sqlite.JDBC");


        return statement.executeQuery(query);
    }

    default int executeUpdate(String query){
        try(Connection connection = DatabaseConnection.SQLiteConnection();
        Statement statement = connection.createStatement()) {

            Class.forName("org.sqlite.JDBC");

            return statement.executeUpdate(query);
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
