package Serialization.Second_Serialization_Program;

import java.io.Serializable;

public class Student implements Serializable {
	
	transient int id;
	String name;
	int age;
	
	public Student(int id, String name, int age) {
		
		this.id =id;
		this.name=name;
		this.age=age;
	}

}
