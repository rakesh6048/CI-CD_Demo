package ForPractice_Number.Second_Practice_Number;

import org.testng.annotations.Test;

public class PrintNumberUsingRecursion {
	
	static int count=0;
	
	@Test
	public void printNumber() {
		
		count++;
		if(count<=10) {
			System.out.println(count);
			printNumber();
		}
	}
	

}
