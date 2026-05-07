package Test;

import java.util.HashMap;

public class Test7 {

	public static void main(String[] args) {

		String s1="welcometowel";
		
		HashMap<Character, Integer> hmp = new HashMap<Character, Integer>();
				
				char ch[]=s1.toCharArray();
				
				for(Character value : ch) {
					
					if(hmp.containsKey(value)) {
						hmp.put(value, hmp.get(value)+1);
					}else {
						hmp.put(value, 1);
					}
				}
				System.out.println(hmp);

	}

}
