package Conditional_Statement;

import java.util.Scanner;

public class Switchcase_Calculator {

	public static void main(String[] args) {
		int num,num2;
		char action;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  Number  ");
		num = sc.nextInt();
		
		System.out.println("Enter Number   ");
		num2 = sc.nextInt();

		System.out.println("Enter Output '+','-','*','/','%'   ");
		action=sc.next().charAt(0);
		
		switch (action) {
		case '+':
		int c=num+num2;
		 System.out.println(c);
		 break;
		case '-':
			 c=num-num2;
			 System.out.println(c);
			 break;
		case '*':
			 c=num*num2;
			 System.out.println(c);
			 break;
		case '/':
			 c=num/num2;
			 System.out.println(c);
			 break;
		default:
			 System.out.println("Invalid");
		}
		 System.out.println("Result: " +num);
		

	}

}
