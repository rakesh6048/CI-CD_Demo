package ForPractice_Number.Second_Practice_Number;

import java.util.Random;
import java.util.Scanner;

import org.testng.annotations.Test;

public class GenerateRandomNumber {
	
	
	
	public static void main(String args[]) {
		
	Random random = new Random();
	
	System.out.println("Please enter the number");
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	
	for(int i=0;i<n;i++) {
		int num = random.nextInt(100);
		System.out.print(num+" ");
	}
	
	}

}
