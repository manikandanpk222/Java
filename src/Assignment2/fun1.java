package Assignment2;

public class fun1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		name="Manikandan";
		int rollno;
		rollno=1515055;
		System.out.println("Student Name"+""+"___"+name+""+rollno);
		
		String name1;
		name1="Sridevi";
		System.out.println("Student Name"+""+"___"+name1+""+""+rollno);
		
		byte myNum = 100;
		System.out.println(myNum);
		
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);     // Outputs true
		System.out.println(isFishTasty);
		
		  String out;
		  int  a = 89, b = 172;
		  out = a<=b ? "Yes":"No";
		  System.out.println("Ans: "+out);
		 
		  char ch = 'k'; // Character to check

	        // Using conditional operators to check if ch is a vowel
	        boolean isVowel = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	                           ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');

	        // Display the result
	        if (isVowel) {
	            System.out.println(ch + " is a vowel.");
	        } else {
	            System.out.println(ch + " is not a vowel.");
	        }
		

	}

}
