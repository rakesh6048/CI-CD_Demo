package Test;

import org.testng.annotations.Test;

public class PreAndPostIncrerment {

	@Test
	public void postIncrement() {

		int a=10;
		int b=a++;

		System.out.println("PostIncrement Result");  

		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		System.out.println("a = "+a);
		System.out.println("a = "+a);

	}

	@Test                                
	public void preIncrement() {      

		int a=10;                      
		int b=++a; 

		System.out.println("PreIncrement Result");  

		System.out.println("a = "+a);  
		System.out.println("b = "+b);
	}

	@Test
	public void tstContinue() {
		int x = 10;

		System.out.println("Continue Statement");
		System.out.println("");
		do {
			x++;
			if(x == 15){
				continue;		 
			}   
			System.out.print("value of x : " + x );
			System.out.print("\n");
		} while( x < 20 );
	}


	@Test                                                                           
	public void preIncrement1() {                                                            

		int a=10;                                                                           
		int b=++a;                                                                          

		System.out.println("PreIncrement Result");                                          

		System.out.println("a = "+a);                                                       
		System.out.println("b = "+b);  
		
		System.out.println("a = "+a); 
		System.out.println("b = "+b);  
	}                                                                               

	@Test                                                                           
	public void tstContinue1() {                                                     
		int x = 10;                                                                

		System.out.println("Continue Statement");                                        
		System.out.println("");  
		System.out.println("");  
		System.out.println("");  
		do {                                                                       
			x++;                                                                    
			if(x == 15){                                                            
				continue;		                                                    
			}                                                                       
			System.out.print("value of x : " + x );                                 
			System.out.print("\n");                                                 
		} while( x < 20 );                                                         
	}                                                                               
}                                  
