package ForPractice_Number.Second_Practice_Number;

import java.util.Scanner;

import org.testng.annotations.Test;

public class FibonacciUsingRecursion {
	
	static int a=0, b=1, n, c=0;
	
	public static void fibonacc(int n) {
		   
		if(n>0) {
		 c=a+b;
		 System.out.print(" "+c);
		 a=b;
		 b=c;
		 fibonacc(n-1);
		}
	}
	public static void main(String arg[]) {
		
		System.out.println("Please enter the number");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		System.out.print(a+" "+b);
		fibonacc(n-1);
	}
}
