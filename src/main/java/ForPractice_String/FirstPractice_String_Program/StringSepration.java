package ForPractice_String.FirstPractice_String_Program;

public class StringSepration {

	public static void main(String[] args) {

		String s1="adfg12hjjs&$";
		int alphabets = 0, numbers = 0, specialChar = 0;
		String TotalAlphabets = "", TotalNumbers = "", TotalSpecialChar = "";
		
		char ch[]=s1.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				alphabets++;
				TotalAlphabets=TotalAlphabets+String.valueOf(ch[i]);
			}else if(ch[i]>'0' && ch[i]<'9') {
				numbers++;
				TotalNumbers =TotalNumbers+String.valueOf(ch[i]);
			}else {
				specialChar++;
				TotalSpecialChar =TotalSpecialChar+String.valueOf(ch[i]);
			}
		}
		
		System.out.println("Number of Alphabets : "+alphabets+" "+"Total Alphabets : "+TotalAlphabets);
		System.out.println("Number of count : "+numbers+" "+"Total Numbers : "+TotalNumbers);
		System.out.println("Number of SpecialCharacter : "+specialChar+" "+"Total SpecialCharacter : "+TotalSpecialChar);

	}

}
