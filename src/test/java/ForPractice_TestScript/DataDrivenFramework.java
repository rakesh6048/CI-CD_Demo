package ForPractice_TestScript;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenFramework {
	
	//https://opensource-demo.orangehrmlive.com/
	
	@Test(dataProvider="DSM")
	public void  verifyLoginDetails(String login, String passwd) {
		
		System.out.println("User has login using username : "+login);
		System.out.println("User has password using password : "+passwd);	
	}
	@DataProvider(name="DSM")
	public Object[][] dataSuplier(){
		
		Object[][] data = {{"Rakesh", "1234"},{"Arin", "4321"},{"Tharun", "7651"}};
		
		return data;
	}
}
