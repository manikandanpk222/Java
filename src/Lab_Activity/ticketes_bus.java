package Lab_Activity;

import java.util.Scanner;

public class ticketes_bus {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        char choice;

	        do {
	            // Input the number of tickets
	            System.out.print("Enter the number of tickets: ");
	            int numOfTickets = scanner.nextInt();

	            // Input the price per ticket
	            System.out.print("Enter the price per ticket: ");
	            double pricePerTicket = scanner.nextDouble();

	            // Calculate the total cost
	            double totalCost = numOfTickets * pricePerTicket;

	            // Display the total cost
	            System.out.println("Total cost for " + numOfTickets + " tickets: $" + totalCost);

	            // Ask if the user wants to recalculate
	            System.out.print("Do you want to recalculate? (Y/N): ");
	            choice = scanner.next().charAt(0);
	        } while (choice == 'Y' || choice == 'Y');

	        // Close the scanner
	        scanner.close();
	    }
	}

	
