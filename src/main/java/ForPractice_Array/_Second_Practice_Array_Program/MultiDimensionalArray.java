package ForPractice_Array._Second_Practice_Array_Program;

import org.testng.annotations.Test;

public class MultiDimensionalArray {

	@Test(enabled = false)
	public void multiDimensionArray() {

		int arr[][] = {{5,7,8}, {9,5,2}, {4,1,7}};

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	@Test(enabled = false)
	public void additionInArray() {

		int a[][] = {{9,8}, {7,4}};
		int b[][] = {{2,7}, {5,3}};

		int c[][] = new int[2][2];

		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				c[i][j]=a[i][j]+b[i][j];

				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

	@Test(enabled = true)
	public void multipicationInArray() {

		int a[][] = {{9,8}, {7,4}};
		int b[][] = {{2,7}, {5,3}};

		int c[][] = new int[2][2];
        
		for(int i=0;i<2;i++) {
		  for(int j=0;j<2;j++) {
			  
			  c[i][j]=0;
			for(int k=0;k<2;k++) {
			 c[i][j]=a[i][k]*b[j][k];
			}
			System.out.print(c[i][j]+" ");
		  }
		  System.out.println();
		}
	}

}
