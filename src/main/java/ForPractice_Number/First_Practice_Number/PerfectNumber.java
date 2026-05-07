package ForPractice_Number.First_Practice_Number;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		
		System.out.println("Please enter the Number");
		Scanner ref = new Scanner(System.in);
		int n= ref.nextInt();
		int sum=0;
		int check =n;
		
		//Perfect Number 28
		
		for(int i=1;i<n;i++) {
			
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==check) {
			System.out.println("Number is perfect : "+sum);
		} else {
			System.out.println("Number is not perfect : "+sum);
		}
	}

}
