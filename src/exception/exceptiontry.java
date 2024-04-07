package exception;

public class exceptiontry {
	
	void hello() {
		System.out.println("hello class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);

		System.out.println(1);
		System.out.println(1);
		System.out.println(1);
		System.out.println(1);
		System.out.println(1);
        try {
        	System.out.println(100/7);

        }
        catch(ArithmeticException e){
        	System.out.println("Math logic");

        }
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);



	}

}
