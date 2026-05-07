package ForPractice_TestScript;

public class Test {
	
	public static void main(String arg[]) {

		try {
		String s1="Welcome for price.50,000";
        String s2[]=s1.split(" ");
        String s3=s2[2];
        String first=s3.substring(6);
        String finalPrice=first.substring(0, 2)+first.substring(3);
        System.out.println(finalPrice);
        int price =Integer.valueOf(finalPrice);
        System.out.println(price+10000);
        
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			
			int arr[][]= {{2,4,5}, {3,4,7}, {1,2,9}};
			int largest = arr[0][0];
			int smallest = arr[0][0];
			
			for(int i=0;i<arr.length;i++) {
			  for(int j=0;j<arr.length;j++) {
				  
				  if(arr[i][j]>largest) {
					  largest =arr[i][j];
				  }
				  
				  if(arr[i][j]<smallest) {
					  smallest=arr[i][j];  
				  }
			  }
			}
			System.out.println("Smallest : "+smallest);
			System.out.println("Largest : "+largest);
			
		}catch(Exception e) {
			System.out.println(e);
		}
        
	}
}
