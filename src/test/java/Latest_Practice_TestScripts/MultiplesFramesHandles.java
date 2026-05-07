package Latest_Practice_TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners
public class MultiplesFramesHandles {
	
	WebDriver driver;
	
	@Test(enabled = true)
	public void launchApp() {
		WebDriverManager.chromedriver().setup();                                  
        
		driver = new ChromeDriver();                                              
		//driver.get("https://chercher.tech/java/abstraction-selenium-java");     
		driver.get("https://demo.automationtesting.in/Frames.html");              
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);          
		driver.manage().window().maximize();                                      
		                                                                          
	}
	
	@Test(priority =1, enabled=true)
	public void verifyMultiplesFrameHandles() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[contains(text(),'Single Iframe ')]")).click();
		Thread.sleep(300);
		
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mohan");
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		Thread.sleep(300);
		
		WebElement secondFrame = driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
		driver.switchTo().frame(secondFrame);
		String nestedFramHeading = driver.findElement(By.xpath("//h5[contains(text(),'Nested iFrames')]")).getText();
		System.out.println("Nested Frame Title : "+nestedFramHeading);
		//driver.switchTo().defaultContent();
		
		WebElement thirdFrame = driver.findElement(By.xpath("//html/body/section/div/div/iframe"));
		driver.switchTo().frame(thirdFrame);
		String innerFramHeading = driver.findElement(By.xpath("//h5[contains(text(),'iFrame Demo')]")).getText();
		System.out.println("Inner Frame Title : "+innerFramHeading);		
	}
	
	@Test(priority =2, enabled=true)
	public void verifyInnerFrameHandles() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[contains(text(),'Single Iframe ')]")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		Thread.sleep(300);
		
		WebElement secondFrame = driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
		driver.switchTo().frame(secondFrame);
		
		driver.switchTo().frame(0);
		String innerFramHeading = driver.findElement(By.xpath("//h5[contains(text(),'iFrame Demo')]")).getText();
		System.out.println("Inner Frame Title : "+innerFramHeading);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sohan");
		
		driver.switchTo().parentFrame();
		String nestedFramHeading = driver.findElement(By.xpath("//h5[contains(text(),'Nested iFrames')]")).getText();
		System.out.println("Nested Frame Title : "+nestedFramHeading);
		
	}

}
