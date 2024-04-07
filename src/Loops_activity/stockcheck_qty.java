package Loops_activity;

import java.util.Scanner;

public class stockcheck_qty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the initial stock qty:");
        
        int initialStock=scanner.nextInt();
        int stockLevel=initialStock;
        System.out.println("Inventory tracking started");
        
        while(stockLevel>0) {
        	 System.out.println("Enter the Qty sold (or-1 to exit):");
        	 int quantitySold=scanner.nextInt();
        
        if(quantitySold==-1) {
        System.out.println("Exiting inventory tracking");
        break;
        }
        if(quantitySold<=stockLevel) {
        	stockLevel=-quantitySold;
        	 System.out.println("Remaining Stock :"+stockLevel);
        }else {
        	 System.out.println("Not enough stock avail.Remaining stock:"+stockLevel);
        }
        System.out.println("Inventory tracking Completed");
        scanner.close();

	}


}
	
}
