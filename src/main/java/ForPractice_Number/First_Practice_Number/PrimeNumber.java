package ForPractice_Number.First_Practice_Number;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

      try {
    	  System.out.println("Please Enter the Number");
    	  Scanner ref =new Scanner(System.in);
    	  int n=ref.nextInt();
    	  String primeNumber ="";
    	  
    	  for(int i=1;i<=n;i++) {
    		  int counter =0;
    		 for(int j=i;j>=1;j--) {
    			 if(i%j==0) {
    				 counter = counter+1;
    			 }
    		 }
    		 if(counter == 2) {
    			 primeNumber=primeNumber+i+" ";
    		 }
    	  }
    	  
    	  System.out.println("Prime Number between 1 To "+n+" : "+primeNumber);
    	  //int primeNo=Integer.valueOf(primeNumber);
    	  //System.out.println("Prime Number between 1 To "+n+" : "+primeNo);
    	  
      }catch(Exception e) {
    	  System.out.println(e);
     }
  }
}
