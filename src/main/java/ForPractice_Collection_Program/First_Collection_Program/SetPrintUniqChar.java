package ForPractice_Collection_Program.First_Collection_Program;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.mysql.cj.conf.StringProperty;

import ForPractice_String.FirstPractice_String_Program.StringPlaimdrom;

public class SetPrintUniqChar {

	public static void main(String arg[]) {
		
		String str = "bccbababd";
		
		
		Set<Character> set = new HashSet<Character>();
		
		for(int i=0;i<str.length();i++) {
		set.add(str.charAt(i));
		}
		
		System.out.println(set);

	}
}
