package eventorganizerframework.database;

public class SimpleDriverLoaderFactory implements DriverLoaderFactory {

	
	@Override
	public IDriverLoader createDriverLoader(String connectionString) {
		// TODO Auto-generated method stub
		return new MySQLDriverLoader();
	}



}
