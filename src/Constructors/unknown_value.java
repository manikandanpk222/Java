package Constructors;

public class unknown_value {
	String name;
	
	unknown_value(){
		name="unknown";
	}
	unknown_value(String stu_name){
		name=stu_name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unknown_value s=new unknown_value();
		unknown_value s1=new unknown_value("prati");
		
		System.out.println(s.name);
		System.out.println(s1.name);

	}

}
