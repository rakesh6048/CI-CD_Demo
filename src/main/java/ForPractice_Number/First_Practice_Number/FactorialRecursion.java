package ForPractice_Number.First_Practice_Number;

import java.util.Scanner;

public class FactorialRecursion {
	
	public static int factorial(int n) {
		
		System.out.println(n);
		if(n==1) {
			return 1;
		} else {
			return n*factorial(n-1);
		}
	}
	
	public static void main(String args[]) {
		
		System.out.println("Please enter the number");
		Scanner ref = new Scanner(System.in);
		int num = ref.nextInt();
		
		System.out.println("Factorial Number of "+num+" : "+factorial(num));
	}

}
