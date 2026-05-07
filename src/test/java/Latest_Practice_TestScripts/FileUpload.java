package Latest_Practice_TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
	
@Test
public void uploadFile() {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@name='upfile']")).sendKeys("/Users/rakeshsingh/Desktop/Testing.xlsx");
	
	WebElement comment=driver.findElement(By.xpath("//input[@name='note']"));
	WebElement press=driver.findElement(By.xpath("//input[@value='Press']"));
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='File Uploaded Succesfuly'", comment);
	//js.executeScript("arguments[0].click();", press);
	 
	Actions act = new Actions(driver);
	act.click(press).perform();
	
    }
}
