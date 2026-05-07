package ForPractice_TestScript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Properties {
	
	public static java.util.Properties empDetails=null;
	
	public static void empInfo()throws FileNotFoundException  {
		
		empDetails = new java.util.Properties();	
	try {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//EmployeeDetails.properties");
		
		empDetails.load(fis);
		
		System.out.println("Name : "+empDetails.getProperty("name"));
		System.out.println("Address : "+empDetails.getProperty("address"));
		System.out.println("Salary : "+empDetails.getProperty("salary"));
		
	}catch(Exception e) {
		System.out.println(e);
	}
	
	}
}
