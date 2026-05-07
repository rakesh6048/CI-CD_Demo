package ForPractice_Array.First_Practice_Array_Program;

public class SortingArrayNumber {

	public static void main(String[] args) {
		
		int arr[] = {85,45,23,67,10,30,15};
		int temp=0;
		
		System.out.println("Print Array before Sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>=arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("\n"+"Print the array after Sorting");
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}

	}

}
