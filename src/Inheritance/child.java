package Inheritance;

class parent{
	public void method1() {
		System.out.println("hii from parent class");	
		}
}

public class child extends parent {
	public void method2() {
		System.out.println("hii from child class");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c=new child();
		c.method2();
		c.method1();

	}

}
