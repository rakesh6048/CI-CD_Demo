package ForPractice_TestScript;

import org.testng.annotations.Test;

public class StringDemo {


	@Test
	public void StringVerify() {

		String name = "my name is Rakesh singh i am a software engineer";

        String aftrRemoveA="";
        String rev="";

		char ch[]= name.toCharArray();

		for(int i=0;i<ch.length;i++){
			int count =1;
			for(int j=i+1;j<ch.length;j++){

				if(ch[i] == ch[j]){
					ch[j]='0';
					count++;

				}
			}
			
			if(ch[i]=='a' && ch[i]!='0'){

				System.out.println(ch[i]+" = "+count);

			}
			if(ch[i]!='0') {
				
				aftrRemoveA = aftrRemoveA+ch[i];
			}
		}
		System.out.println("PrintString : "+aftrRemoveA);
		for(int i=aftrRemoveA.length()-1;i>=0;i--) {
			
			rev= rev+aftrRemoveA.charAt(i);
		}
		
		System.out.println("\n"+"REverse Name String : "+rev);
		

	}
}
