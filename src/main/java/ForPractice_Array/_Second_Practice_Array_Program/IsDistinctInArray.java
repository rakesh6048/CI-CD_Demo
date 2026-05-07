package ForPractice_Array._Second_Practice_Array_Program;

import org.testng.annotations.Test;

public class IsDistinctInArray {
	
	@Test
	public void isDistinctInArray() {
		
		int arr[] = {10, 20, 15, 20, 10};
		
		for(int i=0;i<arr.length;i++) {
			boolean isDistinct =false;
			for(int j=0;j<i;j++) {
				
				if(arr[i] == arr[j]) {
					isDistinct=true;
					break;
				}
			}
			if(!isDistinct) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
