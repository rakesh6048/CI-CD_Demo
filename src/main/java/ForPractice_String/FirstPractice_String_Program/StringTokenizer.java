package ForPractice_String.FirstPractice_String_Program;

public class StringTokenizer {

	public static void main(String[] args) {

      java.util.StringTokenizer st = new java.util.StringTokenizer("Welcome To Java");
      
      while(st.hasMoreTokens()) {
    	  System.out.println(st.nextToken());
      }
	}

}
