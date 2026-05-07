package ForPractice_String.FirstPractice_String_Program;

public class StringFindVowelsConsonentCount {

	public static void main(String[] args) {

		String s1="afgisteoe67 679ir sto98323@#&@*";
		int vowels=0, consonent=0, count=0, space=0;
		String TotalsVowels = "" ;
		String TotalConsonent = "";
		String TotalNumbers ="";
		String TotalSpaces = "";

		char ch[] = s1.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]=='a'|| ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
				vowels++;
				TotalsVowels = TotalsVowels+String.valueOf(ch[i]);
			}else if(ch[i]>'a' && ch[i]<'z') {
				consonent++;
				TotalConsonent=TotalConsonent+String.valueOf(ch[i]);
			}else if(ch[i]>'0' && ch[i]<'9') {
				count++;
				TotalNumbers = TotalNumbers+String.valueOf(ch[i]);
			}else if(ch[i]==' ') {
				space++;
				TotalSpaces = TotalSpaces+String.valueOf(ch[i]);
			}
		}
        
		System.out.println("Numbers of Vowels : "+vowels+" "+"Total Vowels : "+TotalsVowels);
		System.out.println("Numbers of Consonent : "+consonent+" "+"Totals Consonent : "+TotalConsonent);
		System.out.println("Numbers of count : "+count+" "+"Total Numbers : "+TotalNumbers);
		System.out.println("Numbers of space : "+space+" "+"Total Spaces : "+TotalSpaces);

	}

}
