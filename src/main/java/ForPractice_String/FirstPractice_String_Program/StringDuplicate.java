package ForPractice_String.FirstPractice_String_Program;

public class StringDuplicate {

	public static void main(String[] args) {

		String s1="My name is rakesh Kumar Sngh My name is rakesh Kumar Sngh My name is rakesh Kumar Sngh My name is rakesh Kumar Sngh welcome to java";
		
		String s2[] = s1.split(" ");
		
		for(int i=0;i<s2.length;i++) {
		    int countNum = 1;
		   for(int j=i+1;j<s2.length;j++) {
			   
			   if(s2[i].equalsIgnoreCase(s2[j])) {
				   s2[j]="0";
				   countNum++;
			   }
		   }
		   if(s2[i]!="0") {
			   System.out.println(s2[i]+ "=" +countNum);
		   }
		}
		
		//String s3="asdfasdfgag11hdjbfm5590@#@";
		
		String s3="My name is rakesh Kumar Sngh My name is rakesh Kumar Sngh My name is rakesh Kumar Sngh My name is rakesh Kumar Sngh welcome to java";
		
		char ch[]=s3.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			int charCountNum = 1;
		   for(int j=i+1;j<ch.length;j++) {			   
			  if(ch[i]==ch[j]) {
				  ch[j]='0';
				  charCountNum++;
			  }  
		   }
		   if(ch[i] != '0') {
			   System.out.print(ch[i] + "=" +charCountNum+" ");
		   }
		}	
	}
}
