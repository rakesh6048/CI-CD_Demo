package ForPractice_Array.First_Practice_Array_Program;

public class Test3 {

	public static void main(String args[]) {


		int arr[] ={0,0,1,1,1,0,0,1,0,1,1,1,1,1,1,0,0,0,1,1,1};
		int arrZero=arr[0];
		int arrOne=arr[0];
		int finalCount=arr[0];

		int countofOne=0;
		int countofzero;
		int j=0;
		int k1=0;
		for(int i=0;i<arr.length;i++){
		    
		    for(j=k1;j<arr.length;j++){
		  
		   if(arr[i]==1){
		     //arrOne=arr[i];
		     countofOne++;
		    }else{
		      break;
		    }
		   }
		    int k11=j;
		    if(k11!=0) {
		   finalCount = countofOne;
		    }
		}
		
		System.out.println(finalCount);
	}
	
}


