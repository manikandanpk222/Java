package Conditional_Statement;

import java.util.Scanner;

public class flightboking {

	public static void main(String[] args) {
		
		Scanner Scanner=new Scanner(System.in);
		
		System.out.println("Welcome to Flight Booking!");
		
		System.out.println("Enter Age:");
		int age=Scanner.nextInt();
		
		System.out.println("Select Destination");
		System.out.println("1.Domestic");
		System.out.println("2.International");
		System.out.println("Enter Ur Choice");
		int destinationChoice=Scanner.nextInt();
		
		String destination;
		switch (destinationChoice) {
		case 1:
			destination="Domestic";
		break;
		case 2:
			destination="International";
		break;
		
		default:
			System.out.println("Invalid.Default to Domestic Destination");
			destination="Domestic";
		}
		

	}

}
