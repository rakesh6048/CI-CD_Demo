package ForPractice_String.FirstPractice_String_Program;

import java.util.Date;

public class StringSorting {

	public static void main(String[] args) {
		
		String s1 ="xusfckmqnaybl";
		char ch[] = s1.toCharArray();
		char temp;
	
		System.out.println("Print the string before Sorting");
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		
		for(int i=0;i<ch.length;i++) {
		  for(int j=0;j<ch.length;j++) {
			  if(ch[j]>=ch[i]) {
				  temp =ch[i];
				  ch[i]=ch[j];
				  ch[j]=temp;
			  }
		  }
		}
		System.out.println("\n"+"Print the string after Sorting");
		for(int k=0;k<ch.length;k++) {
		  System.out.print(ch[k]);
		}
		
		String s2 = "Welcome To Java";
		String value[] = s2.split(" ");
		
		System.out.println("\n"+"Print the splited string");
		for(String s3 : value) {
			System.out.print(s3+" ");
		}
		
		Date date = new Date();
		String s4 = String.valueOf(date);
		System.out.println("\n"+date);
		System.out.println(s4);
	}

}
