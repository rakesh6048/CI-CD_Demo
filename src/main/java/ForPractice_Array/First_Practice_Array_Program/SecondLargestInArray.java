package ForPractice_Array.First_Practice_Array_Program;

public class SecondLargestInArray {

	public static void main(String[] args) {
		
		int arr[] = {80,10,20,34,26,15,100};
		int largest =arr[0];
		int SecondHeighest = arr[0];
		
		System.out.println("Print the given Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest){
			   SecondHeighest =largest;
			   largest = arr[i];
		}else if(arr[i]>SecondHeighest){
			   SecondHeighest =arr[i];
		}
		}
		
		System.out.println("Largest Number : "+largest);
		System.out.println("Second Heighest Number : "+SecondHeighest);

	}

}
