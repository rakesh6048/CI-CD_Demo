package ForPractice_Pattern.Second_Patern_Program;

import org.testng.annotations.Test;

public class Pattern7 {
	
	public static void main(String args[]) {
		
		for(int i=1;i<=7;i++) {
		  for(int j=1;j<=i;j++) {
			  
			  System.out.print(j+" ");
		  }
		  for(int j=i-1;j>=1;j--) {
			  System.out.print(" "+j);
		  }
		  System.out.println();
		}
	}
}
