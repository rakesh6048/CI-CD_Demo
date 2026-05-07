package ForPractice_String.SecondSetPractice_String_Program;

import org.testng.annotations.Test;

public class ReverseStringAndWord {
	
	
	@Test(enabled=false)
	public void reversString() {
		
		String s1="RakeshSingh";
		String rev="";
		
		System.out.println("Print the sample String");
		for(int i=0;i<s1.length();i++) {
			System.out.print(s1.charAt(i));
		}
		System.out.println("\n"+"Print the reverse string");
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
		  
	}
	
	@Test(enabled=false)
	public void reverseStringWithMoreWord() {
		String s1 ="API Automation Testing using RestAssured";
		String rev="";
		
		System.out.println("Print Sample String S1");
		for(int i=0;i<s1.length();i++) {
			System.out.print(s1.charAt(i));
			
		}
		System.out.println("\n"+"Print reverse string s1");
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
		System.out.println();
		
		
	}
	
	@Test(enabled=true)
	public void reverseWordOfString() {
		String s1 ="API Automation Testing using RestAssured";
		String s2[]=s1.split(" ");
		String rev="";
		
		System.out.println("Print the sample String");
		for(int i=0;i<s2.length;i++) {
			System.out.print(s2[i]+" ");
		}
		System.out.println("\n"+"Print the reverse String");
		for(int i=s2.length-1;i>=0;i--) {
			rev=rev+s2[i]+" ";
		}
		System.out.println(rev);
		System.out.println("Reverse the word of String");
		for(int i=0;i<s2.length;i++) {
			String revWord="";
			String s3 = s2[i];
			for(int j=s3.length()-1;j>=0;j--) {
				revWord = revWord+s3.charAt(j);
			}
			
			System.out.print(revWord+" ");
		}
		
		
	}
}
