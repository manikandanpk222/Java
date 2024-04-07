package Constructors;

public class example {
	String name;
	int rollno;
	
	example(String stu_name,int stu_rollno){
		name=stu_name;
		rollno=stu_rollno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example e=new example("Harshada",10);
		System.out.println(e.name);
		System.out.println(e.rollno);

	}

}
