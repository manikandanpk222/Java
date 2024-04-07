package areacalc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		int radius = sc.nextInt();
		System.out.println("Enter length");
		int length = sc.nextInt();
		
		System.out.println("Enter Width");
		int width = sc.nextInt();
		
		Circle circle = new Circle(radius);
		Rectangle rectangle = new Rectangle(length, width);
		
		//Calling abstract and concrete methods
		circle.display();
		System.out.println("Area of the circle: " + circle.calculateArea());
		rectangle.display();
		System.out.println("Area of the rectangle: " + rectangle.calculateArea());
        
        
        
	}


}
