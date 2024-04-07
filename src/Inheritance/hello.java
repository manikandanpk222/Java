package Inheritance;

class zoom{
	zoom(){
		System.out.println("iam zoom constructor");
	}
}

public class hello extends zoom {
	hello(){
	super();
	System.out.println("iam callconst constructor");
}
void call() {
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        hello c= new hello();
	}

}
