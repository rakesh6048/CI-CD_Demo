package ForPractice_Number.Second_Practice_Number;

import java.util.Scanner;

import org.testng.annotations.Test;

public class NumberPlaimdrom {
	
	public static void main(String args[]) {
		System.out.println("Please enter the number");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		int check=n;
		int r;
		
		while(n>0) {
			r=n%10;
			rev = (rev*10)+r;
			n=n/10;
		}
		if(rev == check) {
			System.out.println("Number is plaimdrom : "+rev);
		}else {
			System.out.println("Number is not plaimdrom : "+rev);
		}
	}

}
