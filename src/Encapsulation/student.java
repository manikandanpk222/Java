package Encapsulation;

public class student {
	private String name;
	private int roll;
	
	public void setname(String name) {
		this.name=name;
	}
	public void setroll(int roll) {
		this.roll=roll;
	}
	public 	String getname() {
		return name;
	}
	public int getroll() {
		return roll;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        student s=new student();
        s.setname("jkl");
        s.setroll(55);
        
        System.out.println(s.getname());
        System.out.println(s.getroll());
	}

}
