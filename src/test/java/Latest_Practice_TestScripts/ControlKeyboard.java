package Latest_Practice_TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ControlKeyboard {
	
	
	@Test
	public void verifyKeyboardActions() {
		
		WebDriver driver;
		try {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement input1 =driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement input2 =driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		
		Actions act = new Actions(driver);
		
		//Enter data using keyboard
		act.moveToElement(input1).sendKeys("Rakesh").perform();
		act.sendKeys(Keys.SPACE).perform();
		act.moveToElement(input1).sendKeys("Singh").perform();
		act.sendKeys(Keys.ENTER).perform();
		act.moveToElement(input1).sendKeys("Rohit").perform();
		act.sendKeys(Keys.SPACE).perform();
		act.moveToElement(input1).sendKeys("Shara").perform();
		
		//Press CTRL+A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		// Preass CTRL+C
		act.keyDown(Keys.CONTROL)
		.sendKeys("c")
		.keyUp(Keys.CONTROL)
		.perform();
		
		//Press tab
		act.keyDown(Keys.TAB)
		.keyUp(Keys.TAB)
		.perform();
		
		//Press CTRL+V
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		if(input1.getAttribute("value").equals((input2.getAttribute("value")))) {
			System.out.println("Text Copied");
		}else{
			System.out.println("Text Copied");
		}
		
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
