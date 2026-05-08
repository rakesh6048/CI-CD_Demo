package Test;

import org.testng.annotations.Test;

public class TypeCasting {
	
	@Test
	public void implicitTypeCasting() {
		
		System.out.println("------ImplicitWait---------");
		int x=5;
		double a=3.5;
		double b=a*x+a/x;
		double c=x/2;
		System.out.println(b);
		System.out.println(c);
	}
	
	@Test                                  
	public void xplilicitTypeCasting() { 
		
		double a=3.8, b=2.5;
		
		System.out.println("------ExplicitWait---------");
		int y=(int) (a/b);
		int z=(int)a/(int)b;
		System.out.println("y= "+y);
		System.out.println("z= "+z);
		System.out.println("");
	}    
	
	@Test                                                    
	public void testing() {                     
		                                                     
		double a=3.8, b=2.5;                                 
		                                                     
		System.out.println("------Just For Tesing---------");
		
	}   
	    
	                                                         
}
