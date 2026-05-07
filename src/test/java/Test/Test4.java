package Test;

import java.io.InputStream;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		
		//Input : Rakesh Kumar

		//Output : hsekaR ramuK
		
		//String userInput="Rakesh Kumar";
		
		Scanner sc=new Scanner(System.in);
		 
		String st = sc.nextLine();
		
		String s2[]=st.split(" ");
		
		for(int i=0;i<s2.length;i++) {
			
			System.out.print(s2[i]+" ");
			
		}	
		System.out.println();
		for(int i=s2.length-1;i>=0;i--) {	
			System.out.print(s2[i]+" ");		
		}
		System.out.println();
		for(int i=st.length()-1;i>=0;i--) {
			System.out.print(st.charAt(i));
		}
		System.out.println();
		for(int i=0;i<s2.length;i++) {
			
			String word=s2[i];
			String wordRev="";
			for(int j=word.length()-1;j>=0;j--) {
				wordRev=wordRev+word.charAt(j);
			}
			System.out.print(wordRev+" ");			
		}	
	}
}
