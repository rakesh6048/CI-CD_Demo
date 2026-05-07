package ForPractice_Number.Second_Practice_Number;

import java.util.Scanner;

public class FactorialUsingRecursion {
	
	public static int factorial(int n) {
		System.out.println(n);
		
		if(n==1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}

	public static void main(String[] args) {

		System.out.println("Please enter the number");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("factorial : "+factorial(n));

	}

}
