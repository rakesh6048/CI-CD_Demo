package ForPractice_Array.First_Practice_Array_Program;

public class ArrayLargestNumber {

	public static void main(String[] args) {
		
		int arr[] = {67, 34, 89, 35, 60, 20};
		int largestNumber = arr[0];
		int smallestNumber = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=largestNumber) {
				largestNumber=arr[i];
			} else if(arr[i]<=smallestNumber) {
				smallestNumber = arr[i];
			}
		}
		
		System.out.println("Largest Number : "+largestNumber);
		System.out.println("Smallest Number : "+smallestNumber);
	}

}
