package eventorganizerframework.database.sql;

public class SimpleDriverLoader implements IDriverLoader {

	@Override
	public void load() {
		String jdbcDriver=new PropertyFileReader().getJdbcDriver();
		// TODO Auto-generated method stub
		try {
            Class.forName(jdbcDriver);
        } catch(ClassNotFoundException e) {
            System.out.println("JDBC Driver Not Found!");
            return;
        }

	}

}
