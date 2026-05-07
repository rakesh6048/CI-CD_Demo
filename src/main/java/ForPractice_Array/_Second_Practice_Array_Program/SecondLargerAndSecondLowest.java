package ForPractice_Array._Second_Practice_Array_Program;

import org.testng.annotations.Test;

public class SecondLargerAndSecondLowest {
	
	@Test
	public void secondLargestAndLowest() {
		
		int arr[]= {10,25,30,15,80,90};
		int temp;
		
		System.out.println("Print the given Array Number");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]) {
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("\n"+"Largest Number in Array : "+arr[0]);
		System.out.println("Second Largest Number in Array : "+arr[1]);
		System.out.println("Lowest Number in Array : "+arr[(arr.length)-1]);
		System.out.println("Second Lowest Number in Array : "+arr[(arr.length)-2]);
		
	}

}
