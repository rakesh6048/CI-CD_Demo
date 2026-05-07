package ForPractice_String.SecondSetPractice_String_Program;

import org.testng.annotations.Test;

public class StringTokenizer {
	
	@Test
	public void verifyStringTokenizer() {
		
		java.util.StringTokenizer st = new java.util.StringTokenizer("Welcome To Java");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
