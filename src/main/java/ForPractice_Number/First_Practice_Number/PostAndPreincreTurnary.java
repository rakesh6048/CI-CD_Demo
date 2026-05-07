package ForPractice_Number.First_Practice_Number;

public class PostAndPreincreTurnary {

	public static void main(String[] args) {
		
		
		int a,b;
		a=10;
		int a1=10, b1;
		
		//Post increment b=10, a=11 - First initialize b equal a then 10 after that increment a=a+1 means 10+1=11
		
		b=a++;
		System.out.println("PostIncre a : "+a);
		System.out.println("PostIncre b : "+b);
		
		//Pre increment b==11, a=11 - First increment then after that initialize
		
		b1=++a1;
		System.out.println("PreIncre a1 : "+a1);
		System.out.println("PreIncre b1 : "+b1);
		
		//Turnary operator
		
		int max = a>b?a:b;
		System.out.println("Max : "+max);

	}

}
