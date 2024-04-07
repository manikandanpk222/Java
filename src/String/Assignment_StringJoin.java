package String;

public class Assignment_StringJoin {

	public static void main(String[] args) {
		CharSequence delimiter ="'";
		CharSequence element1="apple";
		CharSequence element2="banana";
		CharSequence element3="orange";
		
		String result=String.join(delimiter,element1,element2,element3);
		System.out.println(result);

	}

}
