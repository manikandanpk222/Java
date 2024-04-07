package polymorphism;

class A {
   void hello() {
	   System.out.println("hiii parent");
   }
}

public class riding extends A {
	@Override
	void hello() {
		super.hello();
		 System.out.println("hiii child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		riding r=new riding();
		A a= new A();
		a.hello();
		r.hello();

	}

}
