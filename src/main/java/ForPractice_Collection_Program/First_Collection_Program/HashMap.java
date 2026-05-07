package ForPractice_Collection_Program.First_Collection_Program;

import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashMap {

	public static void main(String[] args) {
	
		java.util.HashMap<Integer, String> hmp = new java.util.HashMap<Integer, String>();
		
		/*hmp.put("Rakesh",101);
		hmp.put("Mohan",102);
		hmp.put("AAAA",103);
		hmp.put("Mohan",104);*/
		
		hmp.put(101,"Rakesh");
		hmp.put(102, "Mohan");
		hmp.put(103,"AAAA");
		hmp.put(104, "Mohan");
	    
	    //System.out.println(ht.toString());
	    

        for(Map.Entry entery : hmp.entrySet()) {
        	System.out.print(entery.getKey()+" ");
        }
	}

}
