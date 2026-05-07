package ForPractice_Number.First_Practice_Number;

import java.util.Scanner;

public class NumberArmStrong {

	public static void main(String[] args) {
 
	//153 is armstrong Number
      System.out.println("Please Enter the Number");
      Scanner ref = new Scanner(System.in);
      int n = ref.nextInt();
      
      int rem=0;
      int sum=0;
      int check=n;
      
      while(n>0) {
    	  
    	rem = n%10;
    	n = n/10;
    	sum = sum+(rem*rem*rem);
      }
      
      if(sum == check) {
    	  System.out.println(sum+" is Armstrong Number");
      }else {
    	  System.out.println(sum+" is not Armstrong Number");
      }

	}

}
