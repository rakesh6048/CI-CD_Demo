package ForPractice_Array._Second_Practice_Array_Program;

import org.testng.annotations.Test;

public class ArrayLargestSmallestNumber {
	
	//@Test
	//public void largetSmallestArraynumber() {
	public static void main(String arg[]) {
		
		int arr[] = {67, 34, 89, 35, 60, 20};
		int largestNumber =arr[0];
		int smallestNumber =arr[0];
		
		System.out.println("Print the given array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=largestNumber) {
				largestNumber=arr[i];
				System.out.print(largestNumber+" ");
			}else if(arr[i]<=smallestNumber) {
				smallestNumber=arr[i];
				System.out.print(smallestNumber+" ");
			}
		}
		System.out.println("Largest Number : "+largestNumber);
		System.out.println("Smallest Number : "+smallestNumber);
	}
 
}










