package Static_methods;

//  static String var="hello";

public class static_nonstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start main method");
		System.out.println("End main method");
		demo();
		class_b.demo_b();
		
		print("hello everyone");

	}
	public static void demo() {
		System.out.println("Hello from method");
	}
	
	public static void print(String value) {
		System.out.println(value);
	}

}
