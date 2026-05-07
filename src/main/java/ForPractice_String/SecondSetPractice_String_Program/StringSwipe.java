package ForPractice_String.SecondSetPractice_String_Program;

import org.testng.annotations.Test;

public class StringSwipe {
	
	@Test
	public void swipeString() {
		
		String s1= "Soh";
		String s2= "MohanSingh";
		
		s1=s1+s2;
		//System.out.println(s1);
		//System.out.println(s1.length());
		//System.out.println(s2.length());
		//System.out.println((s1.length()) - (s2.length()));
		s2=s1.substring(0, ((s1.length()) - (s2.length())));
		
		//System.out.println(s2);
		s1=s1.substring(s2.length());
		//System.out.println(s2.length());
		//System.out.println(s1);
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
	}

}
