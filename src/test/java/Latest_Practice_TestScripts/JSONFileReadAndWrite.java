package Latest_Practice_TestScripts;

import org.json.simple.JSONArray;
import org.json.simple.JSONAware;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class JSONFileReadAndWrite {
	
	
	@Test(enabled = true)
	public void JSONFileWrite() {
		
		JSONObject empDetails1 = new JSONObject();
		
		empDetails1.put("FirstName", "Rakesh");
		empDetails1.put("LastName", "Singh");
		empDetails1.put("CompanyName", "Photon");
		
		JSONObject empObject1 = new JSONObject();
		empObject1.put("EmpDetails1", empDetails1);
		
        JSONObject empDetails2 = new JSONObject();
		
		empDetails2.put("FirstName", "Mohan");
		empDetails2.put("LastName", "Mishra");
		empDetails2.put("CompanyName", "Hinduja");
		
		JSONObject empObject2 = new JSONObject();
		empObject2.put("EmpDetails2", empDetails2);
		
        JSONObject empDetails3 = new JSONObject();
		
		empDetails3.put("FirstName", "Sohan");
		empDetails3.put("LastName", "Sharma");
		empDetails3.put("CompanyName", "HCL");
		
		JSONObject empObject3 = new JSONObject();
		empObject3.put("EmpDetails3", empDetails3);
		
		JSONArray empList = new JSONArray();
		empList.add(empObject1);
		empList.add(empObject2);
		empList.add(empObject3);
		
		System.out.println(empList);
		
		try {
			
			FileWriter fw = new FileWriter("D:/Read&WriteExcel/JsonEmployeeDetails.json");
			
			fw.write(empList.toJSONString());
			
			fw.flush();
			fw.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	@Test(enabled = true)
	public void readJSONFie() {
		
		JSONParser parser = new JSONParser();
		
		try {
			
			FileReader fr = new FileReader("D:/Read&WriteExcel/JsonEmployeeDetails.json");
			
			Object obj = parser.parse(fr);
			
			JSONAware empList = (JSONAware)obj;
			System.out.println(empList);
			
			fr.close();	
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
