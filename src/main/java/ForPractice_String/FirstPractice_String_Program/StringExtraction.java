package ForPractice_String.FirstPractice_String_Program;

public class StringExtraction {

	public static void main(String[] args) {
		
		String s1="welcome30java";
		String s2="w5el2come25";
		
		String alphabets = s1.replaceAll("[^a-z]", "");
		String number =s2.replaceAll("[^0-9]", "");
		
		System.out.println("Total Extracted String : "+alphabets);
		System.out.println("Total Extracted Number : "+number);
		
		int num = Integer.valueOf(number);
		
		System.out.println(num);
	}

}
