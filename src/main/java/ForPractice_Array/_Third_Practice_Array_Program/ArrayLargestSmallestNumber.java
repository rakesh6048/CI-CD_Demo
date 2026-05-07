package ForPractice_Array._Third_Practice_Array_Program;

public class ArrayLargestSmallestNumber {

	public static void main(String[] args) {
		
		
		int arr[]= {80,34,70,38,89,60,20};
		
		int largestNumber=arr[0];
		int smallestNumber=arr[0];
		int secondLargestNumber=arr[0];
		int secondSmallestNumber=arr[0];
		int thirdLargestNumber=arr[0];
		int thirdSmallestNumber=arr[0];
		int fourthLargestNumber=arr[0];
		int fourthSmallestNumber=arr[0];
		
		System.out.println("Print the array number");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>=largestNumber ) {
				secondLargestNumber=largestNumber;
				largestNumber=arr[i];	
				
			}else if(arr[i]>=secondLargestNumber) {
				thirdLargestNumber=secondLargestNumber;
				secondLargestNumber=arr[i];
				
			}else if(arr[i]>=thirdLargestNumber) {
				fourthLargestNumber=thirdLargestNumber;
				thirdLargestNumber=arr[i];
			}else if(arr[i]>=fourthLargestNumber) {
				fourthLargestNumber=arr[i];
			}else if(arr[i]<=smallestNumber) {
				secondSmallestNumber=smallestNumber;
				smallestNumber=arr[i];
				
			}else if(arr[i]<=secondSmallestNumber) {
				thirdSmallestNumber=secondSmallestNumber;
				secondSmallestNumber=arr[i];
			}else if(arr[i]<=thirdSmallestNumber) {
				fourthSmallestNumber=thirdSmallestNumber;
				thirdSmallestNumber=arr[i];
			}else if(arr[i]<=fourthSmallestNumber) {
				fourthSmallestNumber=arr[i];
			}
		}
		System.out.println("");
		System.out.println("Largest Number is : "+largestNumber);
		System.out.println("Smallest Number is : "+smallestNumber);
		System.out.println("Second Largest Number is : "+secondLargestNumber);
		System.out.println("Second Smallest Number is : "+secondSmallestNumber);
		System.out.println("Third Largest Number is : "+thirdLargestNumber);
		System.out.println("Third Smallest Number is : "+thirdSmallestNumber);
		System.out.println("Fourth Largest Number is : "+fourthLargestNumber);
		System.out.println("Fourth Smallest Number is : "+fourthSmallestNumber);
  }

}
