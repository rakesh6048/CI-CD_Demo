package ForPractice_Collection_Program.Second_Collection_Program;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

public class ArrayList {
	
	@Test
	public void arraList() {
		
		java.util.ArrayList<String> al = new java.util.ArrayList<String>();
		
		al.add("Mohan");
		al.add("Sohan");
		al.add("Rohan");
		al.add("Mohan");
		al.add("Sohan");
		
		System.out.println("traverse the element using Iterator");
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("traverse the element using for each");
		
		for(String e1 : al) {
			System.out.println(e1);
		}
		
		//Print unique element from ArrayList
		
		Set<String> set = new HashSet<String>(al);
		
		System.out.println("Remove duplicate element");
		System.out.println(set);
		
		//Sort the element from ArrayList
		
		
		
	}

}
