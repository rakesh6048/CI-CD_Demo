package ForPractice_String.SecondSetPractice_String_Program;

import java.util.HashMap;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(ListnerDemo.class)
public class DuplicateStringAndChar {
	
	@Test(enabled = false)
	public void verifyDuplicateString() {
		
		String s1="My name is rakesh Kumar Sngh My name is rakesh Kumar Sngh My name is rakesh Kumar Sngh My name is rakesh Kumar Sngh welcome to java";
		
		String s2[]=s1.split(" ");
		
		for(int i=0;i<s2.length;i++) {
			int count=1;
			for(int j=i+1;j<s2.length;j++) {
				
				if(s2[i].equalsIgnoreCase(s2[j])) {
					s2[j]="0";
					count++;
				}
			}
			if(s2[i]!="0") {
				System.out.println(s2[i]+" = "+count+" ");
			}
		}
	}
	
	@Test(enabled = true)
	public void verifyDuplicateCharacter() {
		
		String s1="asdfasdfgag11hdjbfm5590@#@";
		
		char ch[] = s1.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				
				 if(ch[i]==ch[j]) {
					  ch[j]='0';
					  count++;
				  }
			}
			if(ch[i]!='0') {
				System.out.print(ch[i]+" = "+count+" ");
			}
		}
		
	}
	@Test(enabled=false)
	public void verifyDuplicates() {
		
		String s1="aaasdfasdfgag11hdjbfm5590@#@";
		
		HashMap<Character, Integer> hmp = new HashMap<Character, Integer>();
		
		char ch[]=s1.toCharArray();
		
		for(Character value : ch) {
			
			//if(Character.isLetterOrDigit(value)) {
				
				if(hmp.containsKey(value)) {
					//System.out.println(hmp.get(value));
					hmp.put(value, hmp.get(value)+1);;
					
				}else {
					hmp.put(value, 1);
				}
			//}
		}
		System.out.println(hmp);
		
		
	}
	@Test(enabled=false)
	public void verifyDuplicatesWords() {
	
		String s1 ="My NamE is khan My Name is khaN djj  $%$ b$%$ $%$";
		
		String s3=s1.toLowerCase();
		
		HashMap<String, Integer> hmp = new HashMap<String, Integer>();
		
		String s2[]=s3.split(" ");
		
		for(String value : s2) {
			
			if(hmp.containsKey(value)) {
				hmp.put(value, hmp.get(value)+1);
			}else {
				hmp.put(value, 1);
			}
			
		}
		System.out.println(hmp);
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



