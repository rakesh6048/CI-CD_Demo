package Latest_Practice_TestScripts;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import org.testng.annotations.Test;

public class ReadDataFromTextFile {
	
	@Test
	public void readFromTextFile() throws FileNotFoundException {
		
		//D:/Read&WriteExcel/demo.txt
		
		FileReader fr = new FileReader("D:/Read&WriteExcel/demo.txt");
		
		Scanner sc = new Scanner(fr);
		StringBuilder sb = new StringBuilder();
		
		while(sc.hasNext()) {
		 sb.append(sc.next()+" ");
		}
		
		System.out.println(sb.toString());
	}
}
 