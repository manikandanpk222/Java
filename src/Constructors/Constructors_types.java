package Constructors;

public class Constructors_types {
	
	Constructors_types(){
		System.out.println("hello from constructors");
	}
	Constructors_types(String a){
		System.out.println(a);
	}
	Constructors_types(int b){
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors_types c=new Constructors_types();
		Constructors_types d=new Constructors_types("manikandan");
		Constructors_types b=new Constructors_types(123);
		Constructors_types r=new Constructors_types(127654);

	}

}
