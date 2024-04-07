package Static_methods;

import java.util.Scanner;

public class static_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter value");
		int a=scanner.nextInt();
		System.out.println("Enter value 2");
		int b=scanner.nextInt();
		int addition =add(a,b);
		System.out.println(addition);
		

	}
	public static int add(int a, int b) {
		return a+b;
	}


}
