package ForPractice_String.FirstPractice_String_Program;

import ForPractice_Array.First_Practice_Array_Program.SecondHighestLowestInArray;

public class IsAnagram {
	
	String s1="abc";
	String s2="bca";
	
	public boolean checkAnagram(String a1, String a2) {
		char chars[]=a1.toCharArray();
		StringBuilder secondString = new StringBuilder(a2);
		for(Character ch : chars) {
			int index = secondString.indexOf(""+ch);
			System.out.println(index);
			if(index!=-1) {
				secondString.deleteCharAt(index);
			}
		}
		if(secondString.length()==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String args[]) {
		
		IsAnagram obj=new IsAnagram();
		boolean returnData = obj.checkAnagram("abc", "bca");
		System.out.println("Return Data : "+returnData);
	}
}
