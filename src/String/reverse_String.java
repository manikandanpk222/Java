package String;

public class reverse_String {
	public static void main(String [] args) {
		String str="dhivya";
		String rev="";
		for (int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			System.out.println((i));
		}
		
		if(str.equals(rev)) {
			System.out.println("Pallindrome string");
		}
		System.out.println("not a pallindrome");
	}

}
