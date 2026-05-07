package ForPractice_String.SecondSetPractice_String_Program;

import org.testng.annotations.Test;

public class findVowelsConsonentCountInString {
	
	@Test
	public void findVowelsConsonentCountString() {
		
		String s1="afgisteoe67 679ir sto98323@#&@*";
		
		int vowels = 0, consonent = 0, number = 0, space = 0, specialchar = 0;
		String totalVowels = "";
		String totalConsonent = "";
		String totalNumber = "";
		String totalSpace = "";
		String totalspecialchar = "";
		
		char ch[] = s1.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
				vowels++;
				totalVowels=totalVowels+String.valueOf(ch[i]);
			}else if(ch[i]>='a' && ch[i]<='z') {
				consonent++;
				totalConsonent = totalConsonent+String.valueOf(ch[i]);
			}else if(ch[i]>='0' && ch[i]<='9') {
				number++;
				totalNumber=totalNumber+String.valueOf(ch[i]);
			}else if(ch[i]==' ') {
				space++;
			}else {
				specialchar++;
				totalspecialchar=totalspecialchar+String.valueOf(ch[i]);
			}
		}
		
		
		
		System.out.println("Vowels & nuber of count vowels : "+totalVowels+" & "+vowels);
		System.out.println("Consonent & nuber of count consonent : "+totalConsonent+" & "+consonent);
		System.out.println("Numbers & nuber of count num : "+totalNumber+" & "+number);
		System.out.println("Total Numbers of space : "+space);
		System.out.println("Special char & nuber of count special char : "+totalspecialchar+" & "+specialchar);
		
		
	}

}
