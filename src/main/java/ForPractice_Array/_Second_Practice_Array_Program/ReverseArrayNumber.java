package ForPractice_Array._Second_Practice_Array_Program;

import org.testng.annotations.Test;

public class ReverseArrayNumber {
	
	
	@Test(enabled=true)
	public void reverseArrayNumbers() {
		int r,n;
		int arr[] = {90,35,67,151,80};
		
		System.out.println("Print the given Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n"+"Reverse each array number");
		for(int i=0;i<arr.length;i++) {
			n=arr[i];
			while(n>0) {
				r=n%10;
				n=n/10;
				System.out.print(r);
			}
			System.out.print(" ");
		}
		System.out.println("\n"+"Reverse the given array");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n"+"after the reverse again reverse each array number");
		for(int i=arr.length-1;i>=0;i--) {
			n=arr[i];
			while(n>0) {
				r=n%10;
				n=n/10;
				System.out.print(r);
			}
			System.out.print(" ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
