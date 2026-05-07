package ForPractice_TestScript;


import java.io.FileWriter;

import org.json.JSONObject;
import org.json.simple.JSONArray;

public class JSONFileWrite {

	public static void main(String[] args) {

	JSONObject empDetails1 = new JSONObject();
	
	empDetails1.put("FirstName", "Sohan");
	empDetails1.put("LastName", "Singh");
	empDetails1.put("CompanyName", "Photon");
	
	JSONObject empObject1 = new JSONObject();
	empObject1.put("EmpDetails1", empDetails1);
	
    JSONObject empDetails2 = new JSONObject();
	
	empDetails2.put("FirstName", "Rohan");
	empDetails2.put("LastName", "Dubey");
	empDetails2.put("CompanyName", "Hinduja");
	
	JSONObject empObject2 = new JSONObject();
	empObject2.put("EmpDetails2", empDetails2);
	
    JSONObject empDetails3 = new JSONObject();
	
	empDetails3.put("FirstName", "Mohan");
	empDetails3.put("LastName", "Panday");
	empDetails3.put("CompanyName", "Virtusa");
	
	JSONObject empObject3 = new JSONObject();
	empObject3.put("EmpDetails3", empDetails3);
	
	JSONArray empList =new JSONArray();
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

}
