package ForPractice_Number.First_Practice_Number;

public class NumberPlaimdrom {

	public static void main(String[] args) {

      int n=121;
      int r;
      int rev=0;
      int check=n;
      
      while(n>0) {
    	  r=n%10;
    	  rev=(rev*10)+r;
    	  n=n/10;
      }
      System.out.println("Reverse Number is "+rev);
      if(rev==check) {
    	  System.out.println("\n"+"Number is plaimdrom : "+rev);
      } else {
    	  System.out.println("Number is not plaimdrom : "+rev);
      }

	}

}
