package ForPractice_String.FirstPractice_String_Program;

import java.util.Scanner;

public class ReverseWordString {

	public static void main(String[] args) {
		
		//String s1 ="API Automation Testing using RestAssured";
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		System.out.println(s1);
		
		String s2[]=s1.split(" ");
		System.out.println(s2.length);
		String RevString = "";
		String RevStrings1 = "";
		String RevWord;
		
		System.out.println("Print the Given String");
		for(int i=0;i<s2.length;i++) {
			System.out.print(s2[i]+" ");
		}
		
		System.out.println("\n"+"Print the String After Reverse");
		for(int i=s2.length-1;i>=0;i--) {
			RevString =RevString+s2[i]+" ";
		}
		System.out.print(RevString);
		
		System.out.println("\n"+"Print the String s1 After Reverse");
		for(int i=s1.length()-1;i>=0;i--) {
			RevStrings1=RevStrings1+s1.charAt(i);
		}
		System.out.print(RevStrings1);
		
		System.out.println("\n"+"Reverse the word of String s2");
		for(int i=0;i<s2.length;i++) {
			RevWord="";
			String s3 = s2[i];
		   for(int j=s3.length()-1;j>=0;j--) {
			   RevWord =RevWord+s3.charAt(j);
		   }
		   System.out.print(RevWord+" ");
		}
	}

}
