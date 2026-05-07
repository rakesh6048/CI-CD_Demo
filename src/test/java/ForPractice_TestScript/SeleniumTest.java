package ForPractice_TestScript;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		//driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
		String pid = driver.getWindowHandle();
		System.out.println(pid);
		
		Set<String> winHandles =driver.getWindowHandles();
		Iterator<String>  itr = winHandles.iterator();
		
		/*String parentWindow = itr.next();
		String secondWindow = itr.next();
		String thirdWindow  = itr.next();*/
		
       List<String> windowIDs = new ArrayList(winHandles);
		
		/*String parentWindow = windowIDs.get(0);
		String secondWindow = windowIDs.get(1);
		String thirdWindow  = windowIDs.get(2);
		
		
		System.out.println("parentWindow : "+parentWindow);
		System.out.println("childWindow : "+secondWindow);
		System.out.println("childWindow : "+thirdWindow);

		//linkedin
		driver.switchTo().window(thirdWindow);
		driver.findElement(By.xpath("//input[@id='email-or-phone']")).sendKeys("7305684658");
		Thread.sleep(1000);
		driver.close();
		//facebook
				Thread.sleep(2000);
				driver.switchTo().window(secondWindow);
				driver.findElement(By.xpath("(//input[@name='email'])[2]")).click();
				driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("rakesh.s@gmail.com");
				Thread.sleep(1000);
				driver.close();
		
		//come back to parrent window
		driver.switchTo().window(parentWindow);
		//driver.switchTo().defaultContent();
		driver.findElement(By.id("txtUsername")).sendKeys("parentWindo@gmail.com");*/
		
		for(String win : winHandles) {
			
			String title = driver.switchTo().window(win).getTitle();
			System.out.println("Title : "+title);
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
			//Thread.sleep(1000);
			//driver.close();
			
		}
		driver.switchTo().window(pid);
		driver.findElement(By.id("txtUsername")).sendKeys("parentWindo@gmail.com");
		
		
		
		
	}

}
