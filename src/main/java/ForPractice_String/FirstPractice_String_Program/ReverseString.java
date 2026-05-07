package ForPractice_String.FirstPractice_String_Program;

public class ReverseString {

	public static void main(String[] args) {
	
		/*String s1 ="Welcome to java";
		String s2[]=s1.split(" ");
		System.out.println(s2.length);
		String RevString ="";
		String RevStr="";
		String RevWord;
		System.out.println(s1.length());
		
		// Reverse Normal String
		System.out.println("Print a given string");
		for(int i=0;i<s1.length();i++) {
			System.out.print(s1.charAt(i));
		}
		System.out.println("\n"+"Print the String After Reverse");
		for(int i=s1.length()-1;i>=0;i--) {
			RevString = RevString+s1.charAt(i);
		}
		System.out.println(RevString);
		
		//Reverse Array String
		
		System.out.println("\n"+"Print the Array String");
		for(int j=0;j<s2.length;j++) {
			System.out.print(s2[j]+" ");
			
		}
		
		System.out.println("\n"+"Reverse the Word in String");
		for(int j=0;j<s2.length;j++) {
			
			RevWord ="";
			String s3 = s2[j];
			for(int k=s3.length()-1;k>=0;k--) {
				RevWord =RevWord+s3.charAt(k);
			}
			System.out.print(" "+RevWord);
			
		}
		System.out.println("\n"+"Reverse the Array String");
		for(int j=s2.length-1;j>=0;j--) {
			RevStr =RevStr+s2[j]+" ";
		}
		System.out.println(RevStr);
	}*/
	
	
	
		String s1 ="Welcome to java";
		String strrev = "";
		String s2[]=s1.split(" ");
		
		for(int i=0;i<s1.length();i++) {
			System.out.print(s1.charAt(i));
		}
	     System.out.println("\n"+"Print String after reverse");
	      
	     for(int i=s1.length()-1;i>=0;i--) {
	    	 strrev = strrev+s1.charAt(i);
	     }
	     System.out.println(strrev);
	     
	    System.out.println("\n"+"Reverse Word String");
	    
	    for(int j=0;j<s2.length;j++) {
	    	String revWord="";
	    	String s3=s2[j];
	    	for(int k=s3.length()-1;k>=0;k--) {
	    		revWord = revWord+s3.charAt(k);
	    	}
	    	
	    	System.out.print(revWord+" ");
	    	
	    }
	     
	     
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
