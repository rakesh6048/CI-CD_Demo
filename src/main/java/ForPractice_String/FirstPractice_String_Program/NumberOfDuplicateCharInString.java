package ForPractice_String.FirstPractice_String_Program;

import java.util.HashMap;

public class NumberOfDuplicateCharInString {

	public static void main(String[] args) {
		
		String s1="asdfasdfgag11hdjbfm5590@#@";
		String s2="asdfasdfg ag11hdj bfm559 0@#@";
		String s3="My name is rakesh Kumar Sngh My name is rakesh Kumar Sngh My name is rakesh Kumar Sngh My name is rakesh Kumar Sngh welcome to java";
		
		HashMap<Character, Integer> hmp = new HashMap<Character, Integer>();
		
		char ch[]=s3.toCharArray();
		
		char ch1[]=s2.toCharArray();
		
		for(Character value : ch) {
			if(Character.isAlphabetic(value) || Character.isDigit(value)) {
				if(hmp.containsKey(value)) {
					hmp.put(value, hmp.get(value)+1);
				}else {
					hmp.put(value, 1);
				}
			}
		}	
	   System.out.println(hmp);
		
	}

}
