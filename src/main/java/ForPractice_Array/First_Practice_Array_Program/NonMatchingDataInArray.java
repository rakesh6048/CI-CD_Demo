package ForPractice_Array.First_Practice_Array_Program;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NonMatchingDataInArray {
	
	public static void main(String[] args) {
		
		 int arr1[] ={40,50,60,70};
		 int arr2[]={30,40,70,80};
		 boolean isfound;
		 
		 for(int i=0;i<arr1.length;i++) {
			 
			 isfound=false;
			for(int j=0;j<arr2.length;j++) {
				
				if(arr1[i] == arr2[j]) {
					isfound=true;
					break;
				}
			}
			if(!isfound) {
				System.out.print(arr1[i]+" ");
			}
		 }
          for(int i=0;i<arr2.length;i++) {
			 
			 isfound=false;
			for(int j=0;j<arr1.length;j++) {
				
				if(arr2[i] == arr1[j]) {
					isfound=true;
					break;
				}
			}
			if(!isfound) {
				System.out.print(arr2[i]+" ");
			}
		 }
		 
	}

}
