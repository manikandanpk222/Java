package Constructors;

public class copycons {
	String name;
	int rollno;
	
	copycons(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
		
	}
	copycons(copycons obj){
		this.name=obj.name;
		this.rollno=obj.rollno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copycons obj1=new copycons("mani",55);
		copycons obj2=new copycons(obj1);
		System.out.println(obj1.name+""+obj1.rollno);
		System.out.println("-----copy-------");
		System.out.println(obj2.name+""+obj2.rollno);

	}

}
