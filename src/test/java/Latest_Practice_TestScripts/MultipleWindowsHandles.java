package Latest_Practice_TestScripts;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowsHandles {
	
	@Test
	public void verifyMultiplesWindowHandles() throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
		String parentID = driver.getWindowHandle();
		System.out.println("ParentID : "+parentID);
		
		Set<String> windowsID = driver.getWindowHandles();
		
		Iterator<String> itr = windowsID.iterator();
		String parentId = itr.next();
		String child =itr.next();
		String child1 = itr.next();
		
		List<String>  windowsIDList =new ArrayList(windowsID);
		
		String pID = windowsIDList.get(0);
		String childID = windowsIDList.get(1);
		String childID1 = windowsIDList.get(2);
		
		for(String win : windowsID) {
			String title = driver.switchTo().window(win).getTitle();
			if(title.equals("Sign Up | LinkedIn")) {
				System.out.println("Window ID : "+win);
				driver.findElement(By.xpath("//input[@id='email-or-phone']")).sendKeys("7305684658");
				Thread.sleep(2000);
			}
			if(title.equals("OrangeHRM - World's Most Popular Opensource HRIS | Secaucus NJ | Facebook")) {
				System.out.println("Window ID : "+win);
				driver.findElement(By.xpath("(//input[@name='email'])[2]")).click();
				driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("rakesh.s@gmail.com");
				Thread.sleep(2000);
			}
			if(title.equals("OrangeHRM Inc - YouTube")) {
				Thread.sleep(2000);
				System.out.println("Window ID : "+win);
				driver.findElement(By.xpath("//input[@id='search']")).sendKeys("HRM");;
				driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();;
				Thread.sleep(2000);
			}
		}
		driver.switchTo().window(parentID);
		driver.findElement(By.id("txtUsername")).sendKeys("parentWindo@gmail.com");
	}
	

}
