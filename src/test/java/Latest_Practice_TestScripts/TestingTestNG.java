package Latest_Practice_TestScripts;

import org.testng.annotations.Test;

public class TestingTestNG {
	
	
	@Test(enabled = true)
	public void test1() {
		System.out.println("Executed Test1");
		int i=1/0;
		System.out.println(i);
	}
	
	@Test(enabled=true, alwaysRun=true, dependsOnMethods= {"test1"})
	public void test2() {
		System.out.println("Executed Test2");
	}

}
