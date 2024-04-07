package Conditional_Statement;

import java.util.Scanner;

public class scanmark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Score:");
        int Score=sc.nextInt();
        
        String grade= switch(Score/10) {
        case 10,9->"A";
        case 8->"B";
        case 7->"C";
        case 6->"D";
        default->"F";
       
        };
        System.out.println("Students Grade:"+grade);
        sc.close();
	}

}
