package String;

public class methodsofstring_buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str1=new StringBuffer();
		System.out.println(str1.capacity());
        CharSequence char2="hello";
        StringBuffer str2=new StringBuffer(char2);
        System.out.println(str2);
		
		StringBuffer str =new StringBuffer("hello java");
		
		System.out.println(str);
		str=str.append("hii");
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
