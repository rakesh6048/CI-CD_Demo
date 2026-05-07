package ForPractice_Number.Second_Practice_Number;

import org.testng.annotations.Test;

public class PostAndPreIncrementOperator {
	
	public static void main(String args[])  {
		
		int a=10, b;
		int a1=20,b1;
		
		b=a++;
		System.out.println("b : "+b);
		System.out.println("a : "+a);
		
		b1=++a1;
		System.out.println("b1 : "+b1);
		System.out.println("a1 : "+a1);
	}

}
