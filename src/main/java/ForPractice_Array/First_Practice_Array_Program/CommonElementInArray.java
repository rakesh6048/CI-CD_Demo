package ForPractice_Array.First_Practice_Array_Program;

public class CommonElementInArray {
	
	public static void main(String []args) {
		
		int arr1[] = {10,23,80,76,30,60};
		int arr2[] = {56,89,10,60,60,23,23};
		int arr3[] = {60,89,10,35,900,23};
		
		
		for(int i=0;i<arr1.length;i++) {
			int j1 = 0, k1=0;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i] ==arr2[j]) {
					arr2[j]=0;
					 j1 =arr1[i];
				   
				}
			}
			
			for(int k=0;k<arr3.length;k++) {
				if(arr1[i] ==arr3[k]) {
					 arr3[k] =0;
				     k1 = arr1[i];
				
			}
			}
			
			if(j1!=0 && k1!=0 ) {
				
				System.out.print(arr1[i]+" ");
			}
			
		}
		
		
	}
	
	
	 /*for(int k=0;k<arr3.length;k++) {
	if(arr1[i] ==arr3[j]) {
		System.out.print(arr1[i]+" ");
	
}

}*/


}
