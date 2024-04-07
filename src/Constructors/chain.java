package Constructors;

public class chain {
	chain(){
		this("hii");
		System.out.println("hello paramterized");
	}
	chain(String a){
		this(5);
		System.out.println("chain 1");
	}
	chain(int b){
		this(45.7,89.6);
		System.out.println("chain 2");
	}
	chain(double c,double d){
		System.out.println("chain 3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		chain c=new chain();
	}

}
