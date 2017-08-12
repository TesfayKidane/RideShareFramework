package rideshare.framework.database.generic;



import java.sql.*;

public class TestConnection {
    
    public static void main(String[] args) throws SQLException {
        

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch(ClassNotFoundException e) {
            System.out.println("JDBC Driver Not Found!");
            return;
        }

                        
                
        String url = "jdbc:mysql://localhost/banking";
        String un = "acm";
        String pw = "1234";
        
        Connection con = DriverManager.getConnection(url, un, pw);
        if (con != null) { 
            System.out.println("DB Connection is OK!");
            con.close();
        }
        else System.out.println("NO DB Connection!!!");
        
    }
    
}

