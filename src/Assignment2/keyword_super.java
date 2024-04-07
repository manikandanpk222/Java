package Assignment2;


class A{
	int i =34;
}

class B extends A{
	int i=78;
}

public void ref(){
	System.out.println(super.i);
	System.out.println(this.i);
	
}



public class keyword_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.ref();

	}


}