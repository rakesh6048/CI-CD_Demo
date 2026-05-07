package Serialization.Second_Serialization_Program;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
	
	public static void main(String arg[]) {
		
		Student s1= new Student(101, "Sohan",20);
		
		try {
		FileOutputStream fout = new FileOutputStream("E:/workspace1/JavaPractices/f.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(s1);
		out.flush();
		out.close();
		System.out.println("Serialize Succesfully");
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
