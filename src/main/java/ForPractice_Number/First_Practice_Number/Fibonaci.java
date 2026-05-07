package ForPractice_Number.First_Practice_Number;

import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		
		int n, a=0, b=1, c=0;
		System.out.println("Enter the Number");
		Scanner in = new Scanner(System.in);
		n= in.nextInt();
		System.out.print(a+" "+b+" ");
		for(int i=0;i<n;i++) {
			
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
