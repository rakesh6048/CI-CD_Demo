package ForPractice_Pattern.Second_Patern_Program;

import org.testng.annotations.Test;

public class Pattern3 {

	public static void main(String args[]) {
		
		for(int i=1;i<=5;i++) {
		   for(int j=1;j<=i;j++) {
			   System.out.print(i+" ");
		   }
		   System.out.println();
		}
		
	}
}
