package Static_methods;

public class static_string_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given=("hello iam");
		
			System.out.println(given);
			int addition=add(5,9);
			System.out.println(addition);
			int subtract=sub(5,9);
			System.out.println(subtract);
			int multi=mul(5,9);
			System.out.println(multi);
		

	}
	public static String print(String value) {
		return value;
	}
	public static int add(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}


}
