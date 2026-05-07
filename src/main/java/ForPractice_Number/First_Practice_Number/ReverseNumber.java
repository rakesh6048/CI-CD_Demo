package ForPractice_Number.First_Practice_Number;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int n,r=0, rev=0;
		System.out.println("Enter the number");
		Scanner ref = new Scanner(System.in);
		n = ref.nextInt();
		
		/*while(n>0) {
			r = n%10;
			n = n/10;
			//System.out.print(r);
		}*/
		
		//this logic apply normal any number of reverse but not apply on  loop or array
		while(n>0) {
			
			r =n%10;
			rev = (rev*10)+r;
			n=n/10;
		}
		
		System.out.println(rev);
	

	}

}
