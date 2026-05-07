package ForPractice_String.FirstPractice_String_Program;

public class SubString {

	public static void main(String[] args) {

       String s1 = " Hello Java ";
       
       String S2=s1.substring(0, 5).toUpperCase();
       System.out.println(S2);
       System.out.println(s1.substring(0, 5).toUpperCase());
       System.out.println(s1.substring(0, 5).toUpperCase()+s1.substring(5).toUpperCase());
       System.out.println(s1.substring(0).toUpperCase().trim());
       System.out.println(s1.substring(0).toUpperCase().trim().startsWith("H"));

	}

}
