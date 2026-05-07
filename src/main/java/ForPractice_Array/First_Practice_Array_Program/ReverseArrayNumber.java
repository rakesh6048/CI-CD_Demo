package ForPractice_Array.First_Practice_Array_Program;

public class ReverseArrayNumber {

	public static void main(String[] args) {

      
      try {
    	  
    	int arr[] = {67, 87, 90, 32, 80};
    	
    	int r,n;
    	System.out.println("Print the given Array");
    	for(int i=0;i<arr.length;i++) {
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println("\n"+"Reverse each digits in array");
    	for(int j=0;j<arr.length;j++) {
    		n=arr[j];
    		while(n>0) {
    		 r=n%10;
    		 n=n/10;
    		 System.out.print(r);
    		}
    		System.out.print(" ");
    	}
    	System.out.println("\n"+"Reverse the array");
    	for(int k=arr.length-1;k>=0;k--) {
    		System.out.print(arr[k]+" ");
    	}
    	System.out.println("\n"+"Revese the array with digits");
    	for(int l= arr.length-1;l>=0;l--) {
    		n=arr[l];
    		while(n>0) {
    			r=n%10;
    			n=n/10;
    			System.out.print(r);
    		}
    		System.out.print(" ");
    	}
      }catch(Exception e) {
    	  System.out.println(e);
      }

	}

}
