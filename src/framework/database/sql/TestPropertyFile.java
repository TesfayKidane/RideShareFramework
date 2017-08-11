package framework.database.sql;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;


public class TestPropertyFile {
  public static void createPropertyFile() {

	Properties prop = new Properties();
	OutputStream output = null;

	try {

		output = new FileOutputStream("config.properties");

		// set the properties value
		prop.setProperty("dbUrl", "jdbc:mysql://localhost/banking");
		prop.setProperty("dbUsername", "acm");
		prop.setProperty("dbPassword", "1234");
		prop.setProperty("jdbcDriver", "com.mysql.jdbc.Driver");

		// save properties to project root folder
		prop.store(output, null);

	} catch (IOException io) {
		io.printStackTrace();
	} finally {
		if (output != null) {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
  }
  
  public static void printFile()
  {
	  Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream("config.properties");

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			System.out.println(prop.getProperty("dbUrl"));
			System.out.println(prop.getProperty("dbUsername"));
			System.out.println(prop.getProperty("dbPassword"));
			System.out.println(prop.getProperty("jdbcDriver"));

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

  }
}