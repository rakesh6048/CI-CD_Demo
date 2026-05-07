package ForPractice_Array.First_Practice_Array_Program;

public class MultiDimensionalArray {

	public static void main(String[] args) {
	
		int arr[][] = {{5,7,8}, {9,5,2}, {4,1,7}};
		
		for(int i=0;i<3;i++) {
		  for(int j=0;j<3;j++) {
			  System.out.print(arr[i][j]+" ");
		  }
		  System.out.println();
		}
	}

}
