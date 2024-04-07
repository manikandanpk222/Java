package exception;

public class finallykey {
	static String g;//null
	

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				
				System.out.println(g.length());	
				}

		
		catch (NullPointerException e) {
			System.out.println("hi from point exception");
		}
			finally {
				System.out.println("Ends....");

	}
	}


	}


