package ForPractice_Array.First_Practice_Array_Program;

public class IsDistinctInArray {
	
	public static void main(String[] args) {
		
		int arr[] = {10, 20, 15, 20, 10};
		
		for(int i=0;i<arr.length;i++) {
			boolean isDistinct = false;
			for(int j=0;j<i;j++) {
				
				if(arr[i] == arr[j]) {
					isDistinct = true;
					break;
				}
			}
			if(!isDistinct) {
				System.out.print(arr[i]+" ");
			}
		}
		
		
	}

}
