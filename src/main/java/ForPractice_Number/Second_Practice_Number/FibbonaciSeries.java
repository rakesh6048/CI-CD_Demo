package ForPractice_Number.Second_Practice_Number;

import java.util.Scanner;

import org.testng.annotations.Test;

public class FibbonaciSeries {

	@Test
	public void fibbonaciSeries() {
		
		int a=0, b=1, c=0, n;
		System.out.println("Please enter the number");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		System.out.print(a+" "+b);
		
		for(int i=0;i<n;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		System.out.println();
	}
	
}
