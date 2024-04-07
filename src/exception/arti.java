package exception;

public class arti {
	void valuemethod(int a,int b) throws ArithmeticException{
		if(b==0) {
			throw new ArithmeticException();
		}
		else {
			int c=a/b;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arti a=new arti();
		try {
			a.valuemethod(2,0);
		}
		catch(Exception e) {
			System.out.println("its error from method");
		}

	}

}
