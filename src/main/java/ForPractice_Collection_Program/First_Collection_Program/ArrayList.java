package ForPractice_Collection_Program.First_Collection_Program;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayList {

	public static void main(String[] args) {

     java.util.ArrayList<String> al =new java.util.ArrayList<String>();
     
     al.add("Book");
     al.add("Pen");
     al.add("Pencil");
     al.add("Book");
     al.add("Pen");
     
     System.out.println(al.toString());
     
     for(String s: al) {
    	 System.out.println(s);
     }
     
     Collections.sort(al);
     Set<String> s= new HashSet<String>(al);
     
     System.out.println(s);
     
     
	}

}