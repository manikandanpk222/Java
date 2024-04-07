package Operators;

public class TernaryLicense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int age=25;
        String result =(age>18)? "Eligible" : "not eligible";
        System.out.println("Car License is :"+result);
        int x=7;
        String result1 = (x % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + x + " is " + result1 + ".");
        
        int a=34,b=36,c=78;
        int x1=(a>b)?a:b;
        int y1=(b>c)?b:c;
        int z1=(x1>y1)?x1:y1;
        System.out.println(z1);
	}

}
