package ForPractice_Collection_Program.First_Collection_Program;

import java.util.HashMap;
import java.util.Map;

public class MapUniqElement {

	public static void uniqCharInStringMap(String s) {
		
		
		HashMap<Character, Integer> hmp = new HashMap<Character, Integer>();
		char[] ch=s.toLowerCase().toCharArray();
		for(char c:ch) {
			if(c==' ') {
				continue;
			}else if(hmp.containsKey(c)) {
				hmp.put(c, hmp.get(c)+1);
			}else {
				hmp.put(c, 1);
			}
		}
		
		for(Map.Entry entry : hmp.entrySet()) {
			
			//if((int)entry.getValue()>1) {
				
				System.out.println(entry.getKey()+" "+entry.getValue());
				
			//}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		
		uniqCharInStringMap("bccbababd");

	}

}
