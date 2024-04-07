package String;

public class stringbuilder_append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder=new StringBuilder();
		
		stringBuilder.append("hello");
		stringBuilder.append("");
		stringBuilder.append(867);
		stringBuilder.append("45,67");
		stringBuilder.append(true);
		stringBuilder.append(new char [] {'m','j'});
		
		System.out.println(stringBuilder.toString());

	}

}
