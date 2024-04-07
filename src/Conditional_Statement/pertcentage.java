package Conditional_Statement;

import java.util.Scanner;

public class pertcentage {

	public static void main(String[] args) {
		
		int percentage;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the percentage");
		percentage=sc.nextInt();
		if(percentage<=35) {
			System.out.println("Grade F");
		}else if (percentage>=36&&percentage<=50) {
			System.out.println("Grade E");
		}
		else if(percentage>=51&&percentage<=80)
		{
			System.out.println("Grade d");
		}
		else if(percentage>=84&&percentage<=90)
		{
			System.out.println("Grade c");
		}
		else if(percentage>=94&&percentage<=100)
		{
			System.out.println("Grade b");
		}
		else if(percentage>=99&&percentage<=100)
		{
			System.out.println("Grade a");
		}
	    Scanner myObj = new Scanner(System.in);
	    String userName;
	    Scanner myObj1 = new Scanner(System.in);
	    String userName2;
	   
	    System.out.println("Enter username"); 
	    System.out.println("Enter username"); 
	    userName = myObj.nextLine(); 
	    userName2 = myObj1.nextLine(); 
	       
	    System.out.println("Username is: " + userName); 
	    System.out.println("Username is: " + userName2); 
	}

}
