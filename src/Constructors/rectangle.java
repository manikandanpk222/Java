package Constructors;

import java.util.Scanner;

public class rectangle {
	double length;
	double breath;
	rectangle(double length,double breath){
		this.length=length;
		this.breath=breath;
	}
	void area () {
		double Area=length+breath;
		System.out.println(Area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length");
		int length=sc.nextInt();
		System.out.println("Enter Breath");
		int breath=sc.nextInt();
		
		rectangle r =new rectangle(length,breath);
		r.area();
		

	}

}
