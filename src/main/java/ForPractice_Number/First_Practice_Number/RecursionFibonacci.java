package ForPractice_Number.First_Practice_Number;

import java.util.Scanner;

public class RecursionFibonacci {
	
	static int a=0, b=1, c=0, n;
	
	public static void fibbonaci(int n) {
		
		if(n>0) {
		 c=a+b;
		 System.out.print(" "+c);
		 a=b;
		 b=c;
		 fibbonaci(n-1);
		}
	}
	
	public static void main(String arg[]) {
		
		System.out.println("Pease enter the number");
		Scanner ref = new Scanner(System.in);
		n= ref.nextInt();
		
		System.out.print(a+" "+b);
		fibbonaci(n-2);
	}

}
