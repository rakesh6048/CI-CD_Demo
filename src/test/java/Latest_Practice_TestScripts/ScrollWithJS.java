package Latest_Practice_TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollWithJS {
	
		public WebDriver driver;
		public JavascriptExecutor js;
		@Test(enabled=true)
		public void launchApp() throws InterruptedException {
		
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		//Scroll Down and Scroll Up Using Java Script
		 
		js = (JavascriptExecutor) driver;
		
		}
		
		@Test(enabled=false)
		public void scrollBy() {
		//Scroll Down
		  js.executeScript("window.scrollBy(0,8000)", "");
	    
		
		//Scroll Up
          js.executeScript("window.scrollBy(0,-6000)", "");
		}
		
		@Test(enabled=false)
		public void scrollHeight() {
			
			//Scroll Down
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			
			//Scroll Up
			js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		}
		
		@Test(enabled=true)
		public void scrollIntoView() {
	    //Scroll up to particular element
	    //Locating element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.linkText("Selenium scroll tutorial"));
		WebElement Element1 = driver.findElement(By.xpath("//strong[contains(text(),'Try Selenium Testing For Free ')]"));
        
        // Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
       }

}
