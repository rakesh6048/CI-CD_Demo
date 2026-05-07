package Latest_Practice_TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllValuesFromDynamicTable {
	
	public WebDriver driver;
	
	@Test
	public void printValuesFromDynamicTable() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		/*WebElement table = driver.findElement(By.id("leftcontainer"));

				List<WebElement> rows=table.findElements(By.tagName("tr"));

				List<WebElement> columns=rows.get(0).findElements(By.tagName(td));

				String cellValue=rows.get(1).columns.get(2).getText();*/
		
		String row ="//*[@id='leftcontainer']/table/tbody/tr";
		int totalNumberOfRow = driver.findElements(By.xpath(row)).size();
		
		String col ="//*[@id='leftcontainer']/table/tbody/tr[1]/td";
		int totalNumberOfColumn = driver.findElements(By.xpath(col)).size();
		
		//"//*[@id='leftcontainer']/table/tbody/tr[0]/td[1]"
		
		String firstPatht ="//*[@id='leftcontainer']/table/tbody/tr[";
		String secondPath ="]/td[";
		String thirdPath ="]";
		
		for(int i=1;i<=totalNumberOfRow;i++) {
		  for(int j=1;j<=totalNumberOfColumn;j++) {
			  String finalPath =firstPatht+i+secondPath+j+thirdPath;
			  System.out.println(finalPath);
			  String valuInText = driver.findElement(By.xpath(finalPath)).getText();
			  System.out.println(valuInText+ " | ");
		  }
		}
	}
}
