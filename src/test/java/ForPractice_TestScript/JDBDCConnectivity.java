package ForPractice_TestScript;

import static ForPractice_TestScript.Properties.empDetails;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.imageio.stream.FileCacheImageInputStream;

public class JDBDCConnectivity extends Properties {
	
	
	static String url ="Jdbc:mysql://localhost:3306/demo_sq_practice";
	static String userName = "admin";
	static String password = "admin";

	public static void main(String[] args) {

		try {
			empDetails =new java.util.Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//EmployeeDetails.properties");
			empDetails.load(fis);
			
			//Load Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Create a connection
			Connection conection = DriverManager.getConnection(url, userName, password);
			
			//create statement
			Statement st = conection.createStatement();
			
			//Execute a query
			ResultSet rs = st.executeQuery("select * from emp");
			
			while(rs.next()) {
				
				/*if(empDetails.getProperty("name").equals(rs.getString(2))) {
					System.out.println("Name : "+rs.getString(2));
				}if(empDetails.getProperty("address").equals(rs.getString(3))) {
					System.out.println("Address : "+rs.getString(3));
				}if(empDetails.getProperty("salary").equals(rs.getString(4))) {
					System.out.println("Salary : "+rs.getString(4));
				}if(empDetails.getProperty("doj").equals(rs.getString(5))) {
					System.out.println("DOJ : "+rs.getString(5));
				}*/
				
				if(empDetails.getProperty("name").equals(rs.getString(2))) {
					 System.out.println(rs.getString(2));
				 }
				 if(empDetails.getProperty("address").equals(rs.getString(3))) {
					 System.out.println(rs.getString(3));
				 }
				 if(empDetails.getProperty("salary").equals(rs.getString(4))) {
					 System.out.println(rs.getString(4));
				 }if(empDetails.getProperty("doj").equals(rs.getString(5))) {
					 System.out.println(rs.getString(5));
				 } 
			}
			//close connection
			conection.close();
    	   
       }catch(Exception e) {
    	   System.out.println(e);
       }
	}
}
