package collection;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	public static void main(String[] args) throws IOException, IOException {
		Properties prop = new Properties();
		prop.load(new FileReader("db.properties"));
		System.out.println(prop.getProperty("username"));
		
	
	}
}
