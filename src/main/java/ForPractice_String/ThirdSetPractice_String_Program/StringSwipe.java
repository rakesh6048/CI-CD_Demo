package ForPractice_String.ThirdSetPractice_String_Program;

import org.testng.annotations.Test;

public class StringSwipe {
	
	
	@Test
	public void swipeString() {
		
		String s1="Ram";
		String s2="Sohan";
		
		System.out.println("Before Swipe");
		System.out.println(s1);
		System.out.println(s2);
		
		s1=s1+s2;
		s2=s1.substring(0, ((s1.length())-(s2.length())));
		s1=s1.substring(s2.length());
		
		System.out.println("After Swipe");    
		System.out.println(s1);                
		System.out.println(s2);                
			
	}
}
