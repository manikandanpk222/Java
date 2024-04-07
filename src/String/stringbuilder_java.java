package String;

public class stringbuilder_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str1=new StringBuilder();
		System.out.println(str1.capacity());
        CharSequence char2="hello";
        StringBuilder str2=new StringBuilder(char2);
        System.out.println(str2);
		
		StringBuilder str =new StringBuilder("hello java");
		
		System.out.println(str);
		str=str.append("hiiooo");
		System.out.println(str);
		str=str.insert(10,"jkl");
		System.out.println(str);
		str=str.delete(5, 10);
		System.out.println(str);
		str=str.replace(5, 10,"java");
		System.out.println(str);
		str=str.reverse();
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.toString());


	}

}
