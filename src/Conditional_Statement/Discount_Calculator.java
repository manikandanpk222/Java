package Conditional_Statement;

import java.util.Scanner;

public class Discount_Calculator {

	public static void main(String[] args) {
	 Scanner sc =new Scanner(System.in);
	 
	 System.out.println("Enter the amount :");
	 double amount=sc.nextDouble();
	 
	 double discount;
	 
	 if(amount>=2000) {
		 discount=0.25;
	 }else if(amount>=1000) {
		 discount=0.15;
	 }else {
		 discount=0.05;
	 }
	 double discountamount=amount+discount;
	 double discountPrice=amount-discount;
	 
	 System.out.println("DiscountPrice:$"+ discountPrice);
	}

}
