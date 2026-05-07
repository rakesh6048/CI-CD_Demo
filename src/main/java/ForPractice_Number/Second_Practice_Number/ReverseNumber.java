package ForPractice_Number.Second_Practice_Number;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ReverseNumber {
	
	public static void main(String args[]) {
		
		int n, r, rev = 0, n1=155;
		System.out.println("Please Enter the Number");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		System.out.println("After Reverse the number");
		while(n>0) {
			r=n%10;
			n=n/10;
			System.out.print(r);
		}
		System.out.println();
		/*while(n1>0) {
			r=n1%10;
			rev=(rev*10)+r;
			n1=n1/10;
		}
		System.out.println("Reverse the Number in other way");
		System.out.println("\n"+rev);*/
	}

}
