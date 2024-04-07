package exception;

public class arrayexceptionbound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int[] a=new int[3];
			a[0]=78;
			a[1]=100/0;//math logic
			a[2]=78;
			a[3]=78;
		}
		catch(ArithmeticException e){
			System.out.println("hello iam arithmetic exception");
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("hello iam array exception");
		}
		System.out.println("every one");

	}

}
