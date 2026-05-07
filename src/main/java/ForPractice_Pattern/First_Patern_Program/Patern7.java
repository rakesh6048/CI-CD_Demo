package ForPractice_Pattern.First_Patern_Program;

public class Patern7 {

	public static void main(String[] args) {

       for(int i=1;i<=7;i++) {
    	  for(int j=1;j<=i;j++) {
    		  System.out.print(" "+j+" ");
    	  }
    	  for(int j=i-1;j>=1;j--) {
    		  System.out.print(" "+j+" ");
    	  }
    	  System.out.println();
       }

	}

}
