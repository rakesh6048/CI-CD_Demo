package Latest_Practice_TestScripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenToWorkOnDataProvider {

	@DataProvider(name = "data")
	public Object[][] dataProviderTest() {
		
		Object [][]obj = {{"Rakesh", "Passwd1"},{"Mohan", "Passwd2"},{"Sohan", "Passwd3"}};
		
		return obj;
	}
	
	@Test(dataProvider ="data")
	public void userLogin(String username, String passwd) {
		System.out.println("UserName : "+username);
		System.out.println("Passwd : "+passwd);
		System.out.println();
	}
}
