package Test;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailTest {
	
	public static void main(String[] args) {

            
	   String s1="welcometowelcomecome";
	    
	   HashMap<Character, Integer> hmp = new HashMap<Character, Integer>();
	      
	      char ch[]=s1.toCharArray();
	      
	      for(Character value : ch){
	          
	          if(hmp.containsKey(value)){
	              
	              hmp.put(value, hmp.get(value)+1);
	        	  
	          }else{
	              hmp.put(value, 1);
	          }
	      }
	      System.out.println(hmp);
	}

}
