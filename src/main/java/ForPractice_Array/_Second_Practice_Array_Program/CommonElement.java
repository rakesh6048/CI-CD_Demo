package ForPractice_Array._Second_Practice_Array_Program;

import org.testng.annotations.Test;

public class CommonElement {
	
	@Test(enabled=true)
	public void commonEelementInArrays() {
		
		int arr1[] = {10,23,45,80,76,30,60};
		int arr2[] = {56,89,10,87,60,23};
		int arr3[] = {60,89,10,35,900,23};
		
		for(int i=0;i<arr1.length;i++) {
			int j1=0,k1=0;
		   for(int j=0;j<arr2.length;j++) {
			   
			   if(arr1[i] == arr2[j]) {
				   j1=arr1[i];
			   }
		   }
		   for(int k=0;k<arr3.length;k++) {
			   if(arr1[i] == arr3[k]) {
				   k1=arr1[i];
			   }
		   }
		   if(j1!=0 && k1!=0) {
			   System.out.println(arr1[i]);
		   }
		}
	}
}
