package Conditional_Statement;
import java.util.Scanner;

public class atm_balance {
	

	    public static void main(String[] args) {
	      
	        double bankBalance = 1000.0;

	        
	        Scanner scanner = new Scanner(System.in);

	    
	        System.out.println("ATM Menu:");
	        System.out.println("1. Deposit");
	        System.out.println("2. Check Balance");
	        System.out.print("Enter your choice: ");
	        int choice = scanner.nextInt();

	        // Perform operations based on user choice
	        switch (choice) {
	            case 1:
	                // Deposit operation
	                System.out.print("Enter the amount to deposit: ");
	                double depositAmount = scanner.nextDouble();
	                bankBalance += depositAmount;
	                System.out.println("Deposit successful. Your new balance is: " + bankBalance);
	                break;
	            case 2:
	                // Check balance operation
	                System.out.println("Your current balance is: " + bankBalance);
	                break;
	            default:
	                System.out.println("Invalid choice");
	        }

	        // Close the Scanner object
	        scanner.close();
	    }
	}

