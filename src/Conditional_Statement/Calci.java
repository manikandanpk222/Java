package Conditional_Statement;
import java.util.Scanner;

public class Calci {

	
	    public static void main(String[] args) {
	     
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the first number
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        // Prompt the user to enter the operator
	        System.out.print("Enter the operator (+, -, *, /): ");
	        char operator = scanner.next().charAt(0);

	        // Prompt the user to enter the second number
	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        // Close the Scanner object
	        scanner.close();

	        double result;

	        // Perform the operation based on the operator
	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                System.out.println("Result: " + result);
	                break;
	            case '-':
	                result = num1 - num2;
	                System.out.println("Result: " + result);
	                break;
	            case '*':
	                result = num1 * num2;
	                System.out.println("Result: " + result);
	                break;
//	            case '/':
//	                if (num2 == 0) {
//	                    System.out.println("Error: Division by zero");
//	                } else {
//	                    result = num1 / num2;
//	                    System.out.println("Result: " + result);
//	                }
//	                break;
	            default:
	                System.out.println("Error: Invalid operator");
	        }
	    }
	


	}

