package ForPractice_Array._Second_Practice_Array_Program;

import org.testng.annotations.Test;

public class SecondHeghestInArray {
	
	@Test
	public void secondHeighestInArray() {
		
		int arr[] = {80,10,20,34,26,15,100};
		int largestNumber= arr[0];
		int secondHeighestNumber = arr[0];
		
		System.out.println("Print the given array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largestNumber) {
				secondHeighestNumber = largestNumber;
				largestNumber=arr[i];
			}else if(arr[i]>secondHeighestNumber) {
				secondHeighestNumber=arr[i];
			}
		}
		
		System.out.println("LargestNumber : "+largestNumber);
		System.out.println("SecondHeighestNumber : "+secondHeighestNumber);
		System.out.println();
		
	}

	
}
