package Latest_Practice_TestScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataFromProperties {

	@Test
	public void readDataFromProperties() throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream fin = new FileInputStream(System.getProperty("user.dir") + "\\EmployeeDetails.properties");
		
		prop.load(fin);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("address"));
		
	}
}
