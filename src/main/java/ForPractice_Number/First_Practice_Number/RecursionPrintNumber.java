package ForPractice_Number.First_Practice_Number;

public class RecursionPrintNumber {
	
	static int count=0;
	
	public static void printNumber() {
		
		count++;
		if(count<=10) {
			System.out.println(count);
			printNumber();
		}
	}
	public static void main(String args[]) {
		
		printNumber();
	}

}
