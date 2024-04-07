package Conditional_Statement;
import java.util.Scanner;

public class packagepricevalue {
	
	
	    public static void main(String[] args) {
	      
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the type of package (Domestic or International): ");
	        String packageType = scanner.nextLine();

	      
	        scanner.close();

	        double basePrice;

	        switch (packageType.toLowerCase()) {
	            case "domestic":
	                basePrice = 100.0; 
	                break;
	            case "international":
	                basePrice = 200.0; 
	                break;
	            default:
	                System.out.println("Invalid package type");
	                return;
	        }

	     
	        System.out.println("Base price for " + packageType + " package: $" + basePrice);
	    }
	}



