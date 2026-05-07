package ForPractice_Number.Second_Practice_Number;

import java.util.Scanner;

import org.testng.annotations.Test;

public class NumberArmStrong {
	
	public static void main(String args[]) {
		
		System.out.println("Please enter the number");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int r;
		int sum=0;
		int check=n;
		
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+(r*r*r);
		}
		
		if(sum == check) {
			System.out.println(sum +" is armstrong");
		} else {
			System.out.println(sum +" is not armstrong");
		}
	}

}
