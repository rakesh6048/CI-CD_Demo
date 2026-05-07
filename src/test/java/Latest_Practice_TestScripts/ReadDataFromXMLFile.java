package Latest_Practice_TestScripts;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import org.testng.annotations.Test;

public class ReadDataFromXMLFile {
	
	@Test
	public void readFromXMLFile() throws FileNotFoundException {
		
		FileReader fr = new FileReader(System.getProperty("user.dir") + "//testng.xml");
		
		Scanner sc = new Scanner(fr);
		StringBuilder sb = new StringBuilder();
		
		while(sc.hasNext()) {
			sb.append(sc.next()+" ");
		}
		System.out.println(sb.toString());
	}

}
