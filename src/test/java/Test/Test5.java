package Test;

public class Test5 {


	public static void main(String[] args) {
		
		
		String one= "abcd abab cab";
		String two = "abcd abcd";
		
		String s2[]=one.split(" ");
		int count = 0;
		for(int i=0;i<s2.length;i++) {
			
			char ch[]=s2[i].toCharArray();
			String str="";
			String str1="";
			for(int j=0;j<ch.length;j++) {
				if(ch[j]=='a' || ch[j]=='b') {
					if(str.equals(two)) {
				     str1=str1+String.valueOf(ch[j]);
				     str=str1;
					}else {
				   str=str+String.valueOf(ch[j]);
					}
				   if(str.equals(two) || str1.equals(two)) {
					   count=count+1;
				   }
				}
			}
		}
		System.out.println(two+"="+count);
	}

}
