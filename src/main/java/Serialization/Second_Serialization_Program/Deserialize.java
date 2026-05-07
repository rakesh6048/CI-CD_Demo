package Serialization.Second_Serialization_Program;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialize {

	public static void main(String[] args) {

     try {
    	 FileInputStream  fin = new FileInputStream("E:/workspace1/JavaPractices/f.txt");
    	 ObjectInputStream oin = new ObjectInputStream(fin);
    	 
    	 Student s=(Student)oin.readObject();
    	 System.out.println("Student ID : "+s.id);
    	 System.out.println("Student Name : "+s.name);
    	 System.out.println("Student Age : "+s.age);
    	 
     }catch(Exception e) {
    	 System.out.println(e);
     }
	}
}
