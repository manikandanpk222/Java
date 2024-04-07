
package Conditional_Statement;

import java.util.Scanner;

public class marks {
	

		    public static void main(String[] args) {
		    
		    	//Students Details input
				String studentName;
				int studentAge, studentMark;
				char studentDivision;
				boolean studentResult;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Student Name  ");
				studentName = sc.nextLine();
				
				System.out.println("Enter Student Age   ");
				studentAge = sc.nextInt();
				
				System.out.println("Enter Student Mark  ");
				studentMark = sc.nextInt();
				
				System.out.println("Enter Student Division   ");
				studentDivision = sc.next().charAt(0);
				
				
				System.out.println("Enter Student Result   ");
				studentResult = sc.nextBoolean();
				
				
				System.out.println("Student Name  " + studentName);
				System.out.println("Student Age  " + studentAge);
				System.out.println("Student Mark  " + studentMark);
				System.out.println("Student Division  " + studentDivision);
				System.out.println("Student Result  " + studentResult);
		    }



	}


