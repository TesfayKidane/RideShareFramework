package eventorganizerframework.database.sql.factory;

import eventorganizerframework.database.sql.IDriverLoader;
import eventorganizerframework.database.sql.SimpleDriverLoader;

public class SimpleDriverLoaderFactory implements DriverLoaderFactory {

	private static DriverLoaderFactory factory = new SimpleDriverLoaderFactory();

	public static DriverLoaderFactory getFactory() {
		return factory;
	}

	@Override
	public IDriverLoader createDriverLoader() {
		// TODO Auto-generated method stub
//		String dbServerName = "";
//		for (int i = 5; i < connectionString.length(); i++) {
//			if (connectionString.charAt(i) == ':') {
//				break;
//			}
//			dbServerName = connectionString.charAt(i) + dbServerName;
//			// Process char
//		}
//		IDriverLoader loader = new MySQLDriverLoader();
////		IDriverLoader loader=null;
//		
//		switch (dbServerName) {
//		case "mysql":
//			loader= new MySQLDriverLoader();
//			break;
//			
//		case "oracle":
//			loader= new MySQLDriverLoader();
//			break;
//		
//		case "sqlserver":
//			loader= new MSSQLDriverLoader();
//			break;
//		
//			
//		default:
//			break;
//		}
//		
//		return loader;
		return new SimpleDriverLoader();
	}

}
