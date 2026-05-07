package ForPractice_Array._Second_Practice_Array_Program;

import org.testng.annotations.Test;

public class SortingArrayNumber {
	
	@Test
	public void sortingArrayNum() {
		
		int arr[] = {85,45,23,67,10,30,15};
		int temp=0;
		
		System.out.println("Print the given array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				if(arr[j]>=arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("\n"+"Print array number after sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

}
