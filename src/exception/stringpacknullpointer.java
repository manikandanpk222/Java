package exception;

public class stringpacknullpointer {
	static String g;
	exceptiontry i;
	void run() {
		i.hello();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 stringpacknullpointer p=new  stringpacknullpointer();
		p.run();
	
			System.out.println(g.length());		}

	
	catch (NullPointerException e) {
		System.out.println("hi from point exception");
	}

}
}
