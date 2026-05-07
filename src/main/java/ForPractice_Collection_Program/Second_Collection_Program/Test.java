package ForPractice_Collection_Program.Second_Collection_Program;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		
		String name1="a1";
		String name2="a2";
		String name3="a3";
		
		List<String>  list1 = new java.util.ArrayList<String>();
		List<String>  list2 = new java.util.ArrayList<String>();
		
		list1.add(name1);
		list1.add(name2);
		list1.add(name3);
		
		list2.add(name1);
		list2.add(name2);
		list2.add(name3);
		
		for(String st : list1) {
			for(String st1 : list2) {
				
			   if(st.equals(st1)) {
				   System.out.println("Value is duplicate : "+ st + st1);
			   }else {
				   System.out.println("Value is not duplicate : "+ st + st1);
			   }
			}
			
		}
		
		
		
		
		
		
		
	}

}
