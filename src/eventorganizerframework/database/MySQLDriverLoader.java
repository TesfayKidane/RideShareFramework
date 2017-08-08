package eventorganizerframework.database;

public class MySQLDriverLoader implements IDriverLoader {

	@Override
	public void load() {
		// TODO Auto-generated method stub
		 try {
	            Class.forName("com.mysql.jdbc.Driver");
	        } catch(ClassNotFoundException e) {
	            System.out.println("JDBC Driver Not Found!");
	            return;
	        }
	}

}
