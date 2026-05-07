package ForPractice_String.SecondSetPractice_String_Program;

import java.util.Scanner;

import org.testng.annotations.Test;

public class StringPlaimdrome {
	
	@Test
	public void checkStringPlaimdrome() {
		
		System.out.println("Please Enter the String");
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String rev ="";
		String check=s1;
		
		System.out.println("Print the given String");
		for(int i=0;i<s1.length();i++) {
			System.out.print(s1.charAt(i));
		}
		System.out.println("\n"+"Reverse the String");
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		if(rev.equalsIgnoreCase(check)) {
			System.out.println("String is Plaimdrom : "+rev);
		}else {
			System.out.println("String is not Plaimdrom : "+rev);
		}
	}

}
