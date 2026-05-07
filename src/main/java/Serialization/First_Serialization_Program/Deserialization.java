package Serialization.First_Serialization_Program;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		
		try {
			//E:/workspace1/JavaPractices/f.txt
			
		  FileInputStream fin = new FileInputStream("D:\\API Automation\\student.txt");
		  ObjectInputStream oin = new ObjectInputStream(fin);
		  
		  Student s=(Student)oin.readObject();
		  System.out.println("Student ID : "+s.id);
		  System.out.println("Student Name : "+s.name);
		  System.out.println("Student Age : "+s.age);
		  oin.close();
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
