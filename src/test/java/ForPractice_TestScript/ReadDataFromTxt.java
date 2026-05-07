package ForPractice_TestScript;

import java.io.FileReader;
import java.util.Scanner;

public class ReadDataFromTxt {

	public static void main(String[] args) {
		
		try {
//new FileReader("D:/Read&WriteExcel/demo.txt"			
			Scanner in = new Scanner(new FileReader("D:/Read&WriteExcel/demo.txt"));
			StringBuilder sb = new StringBuilder();
			
	        while(in.hasNext()) {
	        	sb.append(in.next()+" ");
	        }
	        String outString = sb.toString();
	        System.out.println(outString);
		
		}catch(Exception e) {
		 
			System.out.println(e);
			
		}

	}

}
