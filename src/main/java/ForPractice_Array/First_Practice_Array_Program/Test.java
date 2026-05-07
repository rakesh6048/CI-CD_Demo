package ForPractice_Array.First_Practice_Array_Program;

public class Test {

	public static void main(String[] args) {

       int n=125;
    	int rev = 0;
    	int r =rev;
    	while(n>0) {
   		 r=n%10;
   		//System.out.println(r);
   		 n=n/10;
   		//System.out.println(n);
   		 //System.out.print(r);
   		}
    	System.out.println(rev);
	}

}
