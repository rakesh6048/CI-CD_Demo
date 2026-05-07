package ForPractice_Number.Second_Practice_Number;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PrimeNumber {
	
	@Test
	public void primeNumber() {
		
		System.out.println("Please enter the number");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String primeNumber ="";
		
		for(int i=1;i<=n;i++) {
			int count=0;
		  for(int j=i;j>0;j--) {
			  
			  if(i%j==0) {
				  count = count+1;
			  }
		  }
		  if(count==2) {
			  primeNumber=primeNumber+i+" ";
		  }
		}
		System.out.println(primeNumber);
		//System.out.println("Print the prime number from 1 To "+n+" : "+Integer.valueOf(primeNumber));
		
	}

}
