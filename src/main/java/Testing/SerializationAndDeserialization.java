package Testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationAndDeserialization implements Serializable{
	
	private static final long serialVersionUID = 1L;
	transient int a;
	String b;
	int c;
	
	SerializationAndDeserialization(int a, String b, int c){
		
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public static void main(String[] args) {
		
		SerializationAndDeserialization object=new SerializationAndDeserialization(10, "serlialized", 20);
		   String fileName="demo.txt";
		   
		   //Serialization
		   
		   try {
			   FileOutputStream file=new FileOutputStream(fileName);
			   ObjectOutputStream objfile=new ObjectOutputStream(file);
			   objfile.writeObject(object);
			   objfile.close();
			   file.close();
			   System.out.println("Object has been serialized");
			   
		   }catch(Exception e) {
			   System.out.println(e);
		   }
		   
		   SerializationAndDeserialization object1=null;
		   
		   //Deserialization
		   
		   try {
			   FileInputStream file=new FileInputStream(fileName);
			   ObjectInputStream objin=new ObjectInputStream(file);
			   object1=(SerializationAndDeserialization) objin.readObject();
			   objin.close();
			   file.close();
			   System.out.println("Object has been Deserialized");
			   System.out.println("a : "+object1.a);
			   System.out.println("a : "+object1.b);
			   System.out.println("a : "+object1.c);
			    
		   }catch(Exception e) {
			   System.out.println(e);
			   System.out.println("");
		   }
		   

	}

}
