package Latest_Practice_TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollWithoutJS {
	
		WebDriver driver; 
		Actions act;
		@Test(enabled =true)
		public void launchTheApp() {
		try { 
		
			 WebDriverManager.chromedriver().setup();  
             
			 driver = new ChromeDriver();    
			                                           
			 driver.get("https://www.apple.com/in/");  
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 driver.manage().window().maximize();     	 
			                                           
			 Thread.sleep(1000);                       
			 act = new Actions(driver);
		}catch(Exception e) {
			System.out.println(e);  
		}
		}
		    @Test(enabled =false)                                    
			public void scrollByAmount() throws InterruptedException {             //Scroll Down And Scroll Up
			 act.scrollByAmount(0, 8000).perform();     
			 Thread.sleep(1000);                        
			 act.scrollByAmount(0, -5000).perform();
			 
			}
			@Test (enabled =false)                                  
			public void scrollKey_Page_DownAndPage_Up() {            
			//scroll down a page                             
			 act.sendKeys(Keys.PAGE_DOWN).build().perform(); 
			 //scroll up a page                              
			 //Thread.sleep(1000);                             
			 act.sendKeys(Keys.PAGE_UP).build().perform();   
			 
			}
			
			@Test(enabled =false)                                  
			public void scrollMoveToElement() {            
			 WebElement element = driver.findElement(By.xpath("//h3/span[contains(text(),'Entertainment')]"));
			 act.moveToElement(element);
			 act.perform();	
			}
			
			@Test(enabled =false)                                  
			public void scrollToElement() { 
				//Scroll upto particular element 
				WebElement element = driver.findElement(By.xpath("//h3/span[contains(text(),'Entertainment')]"));
				act.scrollToElement(element);
				 act.perform();	
			}
			
			@Test(enabled =false)
			 public void scrollFromOrigin_FromElement() {
				WebElement footer = driver.findElement(By.tagName("footer"));
		        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(footer, 0, -1000);
		        act.scrollFromOrigin(scrollOrigin,0, 6000);
		        act.perform();
			}	
			@Test(enabled =true)
			public void scrollFromOrigin_FromViewport() {
				WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromViewport(200, 200);
		        act.scrollFromOrigin(scrollOrigin, 0, 2000);
		        act.perform();		
	  }
}
