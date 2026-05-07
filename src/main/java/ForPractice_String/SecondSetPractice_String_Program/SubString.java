package ForPractice_String.SecondSetPractice_String_Program;

import org.testng.annotations.Test;

public class SubString {
	
	@Test
	public void subStringDemo() {
		
		String s1="Hello, Welcome To Java";
		
		System.out.println(s1.substring(0, 14).toUpperCase());
		System.out.println(s1.substring(7).toLowerCase());
		System.out.println(s1.substring(0).trim().startsWith(s1, 'H'));
		System.out.println(s1.substring(0, 5).toUpperCase()+s1.substring(5).toLowerCase());
	}
}
