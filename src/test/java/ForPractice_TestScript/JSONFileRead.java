package ForPractice_TestScript;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONFileRead {

	public static void main(String[] args)throws FileNotFoundException, IOException, ParseException {
		
       JSONParser parser = new JSONParser();
       
       try {
    	   
       FileReader fr = new FileReader("D:/Read&WriteExcel/JsonEmployeeDetails.json");
       
       Object obj = parser.parse(fr);
       
       JSONArray empList = (JSONArray) obj;
       
       System.out.println(empList);
    	   
    	   
       }catch(Exception e) {
    	   System.out.println(e);
       }

	}

}
