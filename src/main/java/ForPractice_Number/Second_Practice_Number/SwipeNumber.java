package ForPractice_Number.Second_Practice_Number;

import org.testng.annotations.Test;

public class SwipeNumber {
	
	@Test
	public void swipeNumbers() {
		
		int a=50;
		int b=100;
		
		System.out.println("Before Swipe the Number");
		System.out.println("\n"+"a : "+a+"\n"+"b : "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("\n"+"After Swipe the Number");
		System.out.println("\n"+"a : "+a+"\n"+"b : "+b);
	}

}
