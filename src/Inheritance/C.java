package Inheritance;


class A{
	void amethod() {
		System.out.println("hello a");
	}
}
class B extends A{
	void bmethod() {
		System.out.println("hello b");
	}
}


public class C extends A {
	void cmethod() {
		System.out.println("hello c");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        C obj=new C();
        obj.amethod();
        obj.cmethod();
        B obj1=new B();
        obj1.bmethod();
	}

}




