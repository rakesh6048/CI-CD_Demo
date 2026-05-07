package ForPractice_Array._Second_Practice_Array_Program;

import org.testng.annotations.Test;

public class SumOfNumberInArray {
	
	@Test
	public void sumOfNumberInArray() {
		
		int arr[]= {5,4,6,7};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		
		System.out.println("Sum : "+sum);
	}

}
