package Latest_Practice_TestScripts;


import static ForPractice_TestScript.Properties.empDetails;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import ForPractice_TestScript.Properties;

public class JDBCConectivity {
	
	static String url ="Jdbc:mysql://localhost:3306/demo_sql_query_practice";
	static String UserName = "admin";
	static String Passwd ="admin";
	
	public static void main(String args[]) {
		
		try {
			Properties.empInfo();
			
			//Register the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Get the Connection
			Connection con = DriverManager.getConnection(url, UserName, Passwd);
			
			//Create Statement
			Statement st = con.createStatement();
			
			//Execute the Query
			ResultSet rs = st.executeQuery("select * from emp");
			
			while(rs.next()) {
				//System.out.println("id "+rs.getInt(1)+" "+"name "+rs.getString(2)+" "+"Salary "+rs.getString(3));
				
				if(empDetails.getProperty("Names").equals(rs.getString(2))) {
					System.out.println(rs.getString(2));
				}
				if(empDetails.getProperty("Salary").equals(rs.getString(3))) {
					System.out.println(rs.getString(3));
				}
				if(empDetails.getProperty("Address").equals(rs.getString(5))) {
					System.out.println(rs.getString(5));
				}
				
			}
			
		//Close Connection
		 con.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
