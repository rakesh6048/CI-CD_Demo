package ForPractice_String.SecondSetPractice_String_Program;

import org.testng.annotations.Test;

public class StringConvert {
	
	@Test
	public void convertIntToString() {
		
		int a=20;
		String s1=String.valueOf(a);
		System.out.println(20+a);
		System.out.println(20+s1);
		
	}
	
	@Test
	public void  convertStringToInt() {
		String s1="20";
		int a = Integer.valueOf(s1);
		System.out.println(20+s1);
		System.out.println(20+a);
	}
	
	@Test
	public void convertCharToString() {
		char ch='H';
		
		String s2= String.valueOf(ch);
		System.out.println(s2+ch);
		System.out.println(s2);
	}

}
