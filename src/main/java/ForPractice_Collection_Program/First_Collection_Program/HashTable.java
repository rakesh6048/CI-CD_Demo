package ForPractice_Collection_Program.First_Collection_Program;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

	public static void main(String[] args) {
		
Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
	    
	    ht.put("Rakesh",101);
		ht.put("Mohan",102);
		ht.put("AAAA",103);
		ht.put("Mohan",104);
	    
	    //System.out.println(ht.toString());
	    

        for(Map.Entry entery : ht.entrySet()) {
        	System.out.print(entery.getKey()+" ");
        	//System.out.print(entery.getValue()+" ");
        }
	    
	}

}
