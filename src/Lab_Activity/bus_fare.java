package Lab_Activity;

import java.util.Scanner;

public class bus_fare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);

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
                
		        
		        // Close the scanner
		        scanner.close();
		    }
		}


	