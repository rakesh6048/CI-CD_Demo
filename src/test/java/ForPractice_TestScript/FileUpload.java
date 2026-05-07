package ForPractice_TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {
		
		try {
		
		//WebDriverManager.firefoxdriver().setup();
			
	   WebDriverManager.chromedriver().setup();
	   
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   
	   driver.findElement(By.xpath("//input[@name='upfile']")).sendKeys("D:/Read&WriteExcel/EmployeeDetails.xlsx");
	   
	   //WebElement upload = driver.findElement(By.xpath("//input[@name='upfile']"));
	   
	   WebElement remark = driver.findElement(By.xpath("//input[@name='note']"));
	   WebElement pressBtn = driver.findElement(By.xpath("//input[@value='Press']"));
	   
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("arguments[0].value='File is uploaded successfully'", remark);	   
	   //js.executeScript("documents[0].value='File is uploaded successfully'", remark);
	     //js.executeScript("document.getElementByName('note').value='File is uploaded successfully'");
	   js.executeScript("arguments[0].click();", pressBtn);
	   //js.executeScript("document[0].click();", pressBtn);
	   
	   
	   Actions act = new Actions(driver);
	   //act.click(pressBtn).perform();
		
			
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
