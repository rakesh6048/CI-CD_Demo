package ForPractice_Array.First_Practice_Array_Program;

public class ArrayMultipicatioAddition {

	public static void main(String[] args) {
		
		int a[][] = {{9,8}, {7,4}};
		int b[][] = {{2,7}, {5,3}};
		
		int c[][] = new int[2][2];
		
		for(int i=0;i<2;i++) {
		  for(int j=0;j<2;j++) {
			  
			  c[i][j]=0;
			  for(int k=0;k<2;k++) {
				  c[i][j] = a[i][k]*b[j][k];
			  }
			  
			  //c[i][j] = a[i][j]+b[i][j];
			  
			  System.out.print(c[i][j]+" ");
			  
		   }
		   System.out.println();
		}

	}

}
