package ForPractice_String.FirstPractice_String_Program;

public class StringConvert {

	public static void main(String[] args) {

        //Convert int to String
		  int a=20;
		  String s = String.valueOf(a);
		  System.out.println(20+s);
		  
		  //Convert String to int
		  
		  int b=Integer.valueOf(s);
		  
		  System.out.println(20+b);
		  
		  //Convert char to string
		  
		  char ch='R';
		  
		  String s2=String.valueOf(ch);
		  
		  System.out.println(s2);

	}

}
