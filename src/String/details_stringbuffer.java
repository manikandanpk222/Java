package String;

import java.util.Scanner;

public class details_stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter your name: ");
		        String name = scanner.nextLine();
		        
		        System.out.print("Enter your age: ");
		        int age = scanner.nextInt();
		        scanner.nextLine();
		        
		        System.out.print("Enter your occupation: ");
		        String occupation = scanner.nextLine();

		        StringBuffer greeting = new StringBuffer();
		        greeting.append("Hello, ");
		        greeting.append(name);
		        greeting.append("You are ");
		        greeting.append(age);
		        greeting.append(" years old and your occupation is ");
		        greeting.append(occupation);
		        greeting.append(".");

		        System.out.println(greeting);

		        scanner.close();
		    }
		


	}

