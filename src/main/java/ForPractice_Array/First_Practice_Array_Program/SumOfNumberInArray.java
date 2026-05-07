package ForPractice_Array.First_Practice_Array_Program;

public class SumOfNumberInArray {

	public static void main(String[] args) {
		
		int arr[]= {5,4,6,7};
        int sum=0;
        
        for(int i=0;i<arr.length;i++) {
        	sum =sum+arr[i];
        }
        System.out.println("Sum Of N Numbers : "+sum);
	}

}
