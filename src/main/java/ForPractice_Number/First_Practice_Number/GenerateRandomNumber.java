package ForPractice_Number.First_Practice_Number;

import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		
		Random ran = new Random();
		System.out.println("Please Enter the Number");
		Scanner ref = new Scanner(System.in);
		int n= ref.nextInt();
		
		for(int i=0;i<n;i++) {
			int num = ran.nextInt(10);
			System.out.print(num+" ");
		}

	}

}
