package ForPractice_Array.First_Practice_Array_Program;

public class SecondHighestLowestInArray {

	public static void main(String[] args) {

		int arr[]= {10,25,30,15,80,90};
		int temp;
		
		for(int i=0;i<arr.length;i++) {
		  for(int j=0;j<i;j++) {
			  
			  if(arr[i]>arr[j]) {
				  temp = arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
			  }
		  }
		}
		System.out.println("Largest Nmuber : "+arr[0]);
		System.err.println("Second largest Number : "+arr[1]);
		System.out.println("Lowest Number : "+arr[(arr.length)-1]);
		System.out.println("Second Lowest Number : "+arr[(arr.length)-2]);

	}

}
