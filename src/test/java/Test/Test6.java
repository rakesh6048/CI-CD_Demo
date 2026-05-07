package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test6 {

	public static void main(String args[]) {
		
		ArrayList<Integer>  al = new ArrayList<Integer>();
		   
		   al.add(20);
		   al.add(50);
		   al.add(30);
		   al.add(40);
		   
		   int key=1;
		   HashMap<Integer, Integer> hmp = new HashMap<Integer, Integer>();
		    
		   for(Integer alist : al) {
			   
			   hmp.put(key++, alist);
		   }
		   
		   System.out.println(hmp);
		   
		   for(Map.Entry<Integer, Integer> m : hmp.entrySet()) {
			   
			   System.out.print(m.getKey()+"="+m.getValue()+" ");
		   }
		   
		
	}

}
