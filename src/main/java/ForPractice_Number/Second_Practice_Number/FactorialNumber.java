package ForPractice_Number.Second_Practice_Number;

import java.util.Scanner;

import org.testng.annotations.Test;

public class FactorialNumber {
	
	@Test
	public void factorialNumber() {
		
		System.out.println("Please enter the number");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial Number : "+fact);
	}

}
