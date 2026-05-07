package ForPractice_String.SecondSetPractice_String_Program;

import org.testng.annotations.Test;

public class StringSorting {
	
	@Test(enabled=false)
	public void stringSortingUsingChar() {
		
		String s1 ="xusfckmqnaybl";
		char ch[]=s1.toCharArray();
		char temp;
		
		System.out.println("Print String before sorting");
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		
		for(int i=0;i<ch.length;i++) {
		  for(int j=0;j<ch.length;j++) {
			  if(ch[j]>=ch[i]) {
				  temp=ch[i];
				  ch[i]=ch[j];
				  ch[j]=temp;
			  }
		  }
		}
		System.out.println("\n"+"Print String after sorting");
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
	}
	@Test(enabled=false)
	public void stringSorting() {
		
		String s1="xydf wer ab pef rez jdb rsdra mnh";
		//String s2[] = s1.split(" ");
		char ch[] = s1.toCharArray();
		char temp;
		
		System.out.println("Print the String before sorting");
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		
		for(int i=0;i<ch.length;i++) {
		   for(int j=0;j<ch.length;j++) {
			   if(ch[j]>=ch[i]) {
				   temp = ch[i];
				   ch[i]=ch[j];
				   ch[j]=temp;
			   }
		   }
		}
		System.out.println("\n"+"Print the String after Sorting");
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
	}
	
	
	@Test(enabled=true)
	public void stringSortingUsingChar1() {
		
		//String s1 ="xusfckmqnaybl";
		String s1="xydf wer ab pef rez jdb rsdra mnh";
		char ch[]=s1.toCharArray();
		
		char temp;
		System.out.println("Print sample String");
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		for(int i=0;i<ch.length;i++) {
		  for(int j=0;j<ch.length;j++) {
			  
			  if(ch[j]>=ch[i]) {
				  temp=ch[i];
				  ch[i]=ch[j];
				  ch[j]=temp;
			  }
		  }
		  //System.out.println();
		}
		System.out.println("\n"+"Print the String after reverse");
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
