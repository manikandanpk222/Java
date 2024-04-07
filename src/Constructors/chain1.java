package Constructors;

public class chain1 {
	String name;
	String city;
	
	chain1(String name,String city){
		this.name=name;
		this.city=city;
	}
	
	public void display(){
		System.out.println(name+city);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chain1 v=new chain1("mas","ind");
		System.out.println(v.name);
		System.out.println(v.city);
		v.display();

	}

}
